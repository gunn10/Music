package Ecommerce;

public class ProductService {
    Product product;

    public ProductService(Product product) {
        this.product = product;
    }

    void discountOnProduct(){
        product.discount();
    }

    void taxOnProduct(){
        product.tax();
    }

    void extraOnProduct(){
        product.extraCosts();
    }


}
