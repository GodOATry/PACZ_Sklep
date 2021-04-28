import Basket.Basket;
import Client.Client;
import Client.Small;
import Client.Medium;
import Client.Big;
import Products.Paper.HarshToiletPaper;
import Products.Paper.SoftToiletPaper;
import Products.Paper.ToiletPaper;
import Products.Product;
import Invoice.Accountant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
public class AccountantTest {
    private Basket basket;
    private Basket basket1;
    private Basket basket2;
    private Product one;
    private Product two;
    private Product three;
    private Client First;
    private Client Second;
    private Client Third;

    @BeforeEach
    public void prepare(){
        Date czas = new Date(2000,3,12);
        basket = new Basket();
        basket1 = new Basket();
        one = new ToiletPaper(1,10,"Papier",10,10,1,"Super");
        two = new SoftToiletPaper(2,10,"PapierSoft",10,10,1,"Super",3,1);
        three = new HarshToiletPaper(3,10,"PapierScierny",10,10,1,"Super",1);
        First = new Small(1, czas, "Olimpijska","156");
        Second = new Medium(1, czas, "Olimpijska","222");
        Third = new Big(1, czas, "Olimpijska","321");
        basket2 = new Basket();
    }

    @Test
    public void DeleteTest(){
        basket.add(two);
        basket1.add(one);
        Accountant John = new Accountant(1);
        John.setActualBasket(basket);
        assertEquals(two,basket.getItem(2));
        John.delete(2);
        assertEquals(null,basket.getItem(2));
        John.setActualBasket(basket1);
        assertEquals(one,basket1.getItem(1));
        John.delete(1);
        assertEquals(null,basket1.getItem(1));
    }
    @Test
    public void addTest(){
        Accountant John = new Accountant(1);
        John.setActualBasket(basket);
        John.add(two);
        assertEquals(two,basket.getItem(2));
        John.setActualBasket(basket1);
        John.add(one);
        assertEquals(one,basket1.getItem(1));
    }
    @Test
    public void generateDiscountTest(){
        basket2.setClientOfBasket(First);
        Accountant John = new Accountant(1);
        John.setActualBasket(basket2);
        John.generateDiscount(0.6d);
        assertEquals(basket2.getAdditionalDiscount(),0.6d);
    }
    @Test
    public void generateinvoiceTest() throws IOException {
        basket2.setClientOfBasket(Third);
        basket2.add(one);
        basket2.add(two);
        Accountant John = new Accountant(1);
        System.out.println("Discount : "+basket2.getClientOfBasket().getDiscount());
        John.setActualBasket(basket2);
//        John.generateDiscount(0.2d);
        John.generateInvoice();
    }



}
