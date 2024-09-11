package Ecommerce;

public class Electronics implements Product{
    @Override
    public void type() {
        System.out.println("electronics");

    }

    @Override
    public void discount() {
        System.out.println("10% discount on electronics");
    }

    @Override
    public void tax() {
        System.out.println("10% tax on electronics");
    }

    @Override
    public void extraCosts() {
        System.out.println("No extra cost on electronics");
    }
}
