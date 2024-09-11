package Ecommerce;

public class Book implements Product{
    @Override
    public void type() {
        System.out.println("book");

    }
    @Override
    public void discount() {
        System.out.println("5% discount on Books");
    }

    @Override
    public void tax() {
        System.out.println("5% tax on Books");
    }

    @Override
    public void extraCosts() {
        System.out.println("No extra cost on Books");
    }
}
