package Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1=new Book();
        Product p2=new Electronics();
        List<Product>list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        p1.extraCosts();
        p2.tax();
        //System.out.println(list);
        CartService c1=new CartService(list);
        c1.add(p1);
        c1.add(p2);
        System.out.println(c1);
        c1.showAll();
    }
}
