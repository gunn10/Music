package Ecommerce;

import java.util.List;

public class Cart {
    List<Product> products;
    Cart INSTANCE;

    public Cart(List<Product> products) {
        this.products = products;
    }

    public Cart getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (INSTANCE) {
                if (INSTANCE == null) {
                    Cart cart = new Cart(products);
                }
            }
        }
        return INSTANCE;
    }


}
