package Pizza;

public class Toppings extends PizzaDecorator{

    Toppings(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String description() {
        return super.description()+" " +"Toppings";
    }

    @Override
    public int price() {
        return super.price()+5;
    }
}
