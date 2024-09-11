package Ecommerce;

public class Clothing implements Product{
    @Override
    public void type() {
        System.out.println("clothes");

    }
    @Override
    public void discount() {
        System.out.println("20% discount on clothes");
    }

    @Override
    public void tax() {
        System.out.println("2% tax on clothes");
    }

    @Override
    public void extraCosts() {
        System.out.println("No extra cost on electronics");
    }
}
