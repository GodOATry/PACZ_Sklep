import Basket.Basket;
import Products.Paper.HarshToiletPaper;
import Products.Paper.SoftToiletPaper;
import Products.Paper.ToiletPaper;
import Products.Product;
import Invoice.Accountant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {
    private Basket basket;
    private Product one;
    private Product two;
    private Product three;

    @BeforeEach
    public void prepare(){
        basket = new Basket();
        one = new ToiletPaper(1,10,"Papier",10,10,1,"Super");
        two = new SoftToiletPaper(2,10,"PapieSoft",10,10,1,"Super",3,1);
        three = new HarshToiletPaper(3,10,"PapierScierny",10,10,1,"Super",1);
    }


    @Test
    public void addTest(){
        basket.add(one);
        basket.add(two);
        basket.add(three);
        assertEquals(3,basket.getListSize());
    }

    @Test
    public void findTest(){
        addTest();
        assertEquals(one,basket.getItem("Papier"));
        assertEquals(three,basket.getItem(3));
        assertEquals(null,basket.getItem("Papir"));
    }

    @Test
    public void deleteTest(){
        addTest();
        basket.delete(one);
        assertEquals(null,basket.getItem("Papier"));
        basket.deleteAll();
        assertEquals(0,basket.getListSize());
    }




}
