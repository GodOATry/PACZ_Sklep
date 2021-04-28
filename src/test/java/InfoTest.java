
import Basket.Basket;
import Products.Groceries.Fruit;
import Products.Groceries.Vegetables;
import Products.Medicine.PainKillers;
import Products.Medicine.Probiotics;
import Products.Other.Chainsaw;
import Products.Other.Mower;
import Products.Paper.HarshToiletPaper;
import Products.Paper.SoftToiletPaper;
import Products.Paper.ToiletPaper;
import Products.Product;
import org.junit.jupiter.api.Test;

import java.util.Date;


public class InfoTest {

    @Test
    public void paperInfo(){
        Product paper1 = new ToiletPaper(10,10,"Papierek",1,10,2,"");
        Product paper2 = new SoftToiletPaper(10,10,"Papierek",1,10,2,"",4,3);
        Product paper3 = new HarshToiletPaper(10,10,"Papierek",1,10,2,"",4);
        System.out.println(paper1.getInfo());
        System.out.println(paper2.getInfo());
        System.out.println(paper3.getInfo());
    }

    @Test
    public void otherInfo(){
        Product machine1 = new Chainsaw(1,10,"XD",1,10,"Sztil",10,"red");
        Product machine2 = new Mower(1,10,"XD",1,10,"Sztil",10,"diesle");
        System.out.println(machine1.getInfo());
        System.out.println(machine2.getInfo());
    }

    @Test
    public void medicineInfo(){
        Date date = new Date();
        Product pill1 = new PainKillers(1,1,"Alap",1,10,"day",date);
        Product pill2 = new Probiotics(1,1,"Alap",1,10,"day",date,3);
        System.out.println(pill1.getInfo());
        System.out.println(pill2.getInfo());
    }

    @Test
    public void groceriesInfo(){
        Product fruit1 = new Fruit(1,1,"Szymek",10,5,true,3);
        Product fruit2 = new Vegetables(1,1,"Szymek",10,5,true,true);
        System.out.println(fruit1.getInfo());
        System.out.println(fruit2.getInfo());
    }

}
