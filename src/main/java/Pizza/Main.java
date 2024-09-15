package Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza basePizza=new BasePizza();
        Pizza toppingsPizza=new Toppings(basePizza);
        System.out.println(toppingsPizza.description());
        System.out.println(toppingsPizza.price());

        Pizza cheesePizza=new Cheese(toppingsPizza);
        System.out.println(cheesePizza.description());
        System.out.println(cheesePizza.price());
    }
}
