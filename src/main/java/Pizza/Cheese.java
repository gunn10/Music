package Pizza;

public class Cheese extends PizzaDecorator{
    Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String description() {
        return super.description()+" " +"Cheese";
    }

    @Override
    public int price() {
        return super.price()+15;
    }

}
