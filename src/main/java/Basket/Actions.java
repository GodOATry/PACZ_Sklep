package Basket;

import java.util.List;

public interface Actions <T> {
     void add(T obj);
     void delete(T obj);
     void modify(T obj);
     List getAll();
     T getItem(int id);
     T getItem(String name);
     void deleteAll();
}
