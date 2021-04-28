package Invoice;

import Basket.Basket;
import Client.Client;
import Client.Big;
import Client.Small;
import Client.Medium;
import Products.Product;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Accountant {
    private int ID;
    private Basket ActualBasket;
    private double Price;

    public Accountant(int ID) {
        this.ID = ID;
    }
    public void generateDiscount(double discount){
        ActualBasket.setAdditionalDiscount(discount);
    }

    public void generateInvoice() throws IOException {
        double Tax = 0d;

        if(ActualBasket.getClientOfBasket() instanceof Big){
            Tax = 0.13d;
        }
        else if(ActualBasket.getClientOfBasket() instanceof Medium){
            Tax = 0.16d;
        }
        else if(ActualBasket.getClientOfBasket() instanceof Small){
            Tax = 0.19d;
        }
        Invoice faktura = new Invoice(1, ActualBasket.getClientOfBasket().getDiscount()+ActualBasket.getAdditionalDiscount(), Tax, ActualBasket.getAll());
        faktura.finalPrice();
        System.out.println("FinalPrice : "+ faktura.getFinalPrice());
        Price = faktura.getFinalPrice();
        File myfile = new File("Faktura"+ActualBasket.getID()+".txt");
        myfile.createNewFile();
        FileWriter write = new FileWriter("Faktura"+ActualBasket.getID()+".txt");
        write.write("Faktura\n");
        write.write("\n");
        write.write("NIP : ");
        write.write(ActualBasket.getClientOfBasket().getNIP());
        write.write("\n");
        write.write("Adres : "+ ActualBasket.getClientOfBasket().getAddress());
        write.write("\n");
        write.write("List of Products : ");
        write.write("\n");
        write.write("\n");
        write.write("Title           Price");
        write.write("\n");
        for(int counter = 0; counter < ActualBasket.getAll().size(); counter++) {
            String tmp = ActualBasket.getAll().get(counter).toString();
            String a1 = "";
            String a2 = "";
            int iterator = 0;
            while (tmp.charAt(iterator) != ' '){
                a1 += tmp.charAt(iterator);
                iterator++;
            }
            while (iterator<tmp.length()) {
                a2 += tmp.charAt(iterator);
                iterator ++;
            }
            iterator=0;
            a2 = addspace(21-(a1.length()+a2.length()),a2);
            write.write(a1);
            write.write(a2);
            write.write("\n");
        }
        write.write("\n");
        write.write("Tax : "+ Tax+ "%");
        write.write("\n");
        write.write("Total : " + faktura.getFinalPrice()+ "$");
        write.write("\n");
        Date date = new Date();
        write.write("Date " + date);
        write.write("\n");
        write.close();

    }

    public void delete(int productID){
        Product container = ActualBasket.getItem(productID);
        System.out.println(container);
        ActualBasket.delete(container);
    }

    public void add(Product chosen){
        Product container = chosen;
        ActualBasket.add(container);
    }
    public void modify(int productID){
        Product container = ActualBasket.getItem(productID);
    }
    public void saveToDataBase(){

    }
    public List getFromDataBase(){
        return ActualBasket.getAll();
    }
    public void setActualBasket(Basket actualBasket) {
        ActualBasket = actualBasket;
    }

    String addspace(int i, String str)
    {
        StringBuilder str1 = new StringBuilder();
        for(int j=0;j<i;j++)
        {
            str1.append(" ");
        }
        str1.append(str);
        return str1.toString();

    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
