package Basket;

import Client.Client;
import Products.Product;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket implements Actions<Product> {
    private static int ID = 0;
    private List<Product> products=new ArrayList<>();
    private int allsize=0;
    private int allcost=0;
    private Client ClientOfBasket;
    private double AdditionalDiscount;

    public Basket() {
        ID++;
    }

    @Override
    public void add(Product obj) {
        products.add(obj);
    }

    @Override
    public void delete(Product obj) {
        for(int i=0;i<products.size();i++){
            if(obj.equals(products.get(i))){
                products.remove(obj);
            }
        }
    }

    @Override
    public void modify(Product obj) {
        //TODO
    }

    @Override
    public List getAll() {
        return products;
    }

    @Override
    public Product getItem(int id) {
        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getID()==id){
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public Product getItem(String name) {
        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getName().equals(name)){
                return products.get(i);
            }
        }
        return null;
    }

    public void setClientOfBasket(Client clientOfBasket) {
        ClientOfBasket = clientOfBasket;
    }

    @Override
    public void deleteAll() {
        products.removeAll(products);
    }

    public int getAllsize() {
        return allsize;
    }

    public void setAllsize(int allsize) {
        this.allsize = allsize;
    }

    public int getAllcost() {
        return allcost;
    }

    public void setAllcost(int allcost) {
        this.allcost = allcost;
    }

    public int getListSize(){
        return products.size();
    }

    public void setAdditionalDiscount(double additionalDiscount) {
        AdditionalDiscount = additionalDiscount;
    }

    public Client getClientOfBasket() {
        return ClientOfBasket;
    }

    public double getAdditionalDiscount() {
        return AdditionalDiscount;
    }

    public static int getID() {
        return ID;
    }
}
