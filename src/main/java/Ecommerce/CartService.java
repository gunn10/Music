package Ecommerce;

import java.util.List;

public class CartService {

    List<Product>products;

    public CartService(List<Product> products) {
        this.products = products;
    }

    void add(Product product){
        System.out.println("Added to cart:"+product.toString());
        products.add(product);
    }
    void showAll(){
        for(Product p:products){
            System.out.println(products);
        }
    }
}
