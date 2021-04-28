package Invoice;

import Products.Product;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Invoice {
    private int ID;
    private double AllDiscounts;
    private double Tax = 0.0d;
    private List<Product> ListaZakupów;
    private double FinalPrice;

    public Invoice(int ID, double allDiscounts, double tax, List ListaZakupów) {
        this.ID = ID;
        AllDiscounts = allDiscounts;
        this.Tax = tax;
        this.ListaZakupów= ListaZakupów;
    }
    public void finalPrice(){
        FinalPrice = 0;

        for (int counter = 0; counter<ListaZakupów.size(); counter++ ){
            FinalPrice += ListaZakupów.get(counter).getCost();
        }
        double tax = Tax * FinalPrice;
        FinalPrice = FinalPrice - (FinalPrice * AllDiscounts);
        FinalPrice = FinalPrice + tax;

    }

    public double getFinalPrice() {
        return FinalPrice;
    }

}
