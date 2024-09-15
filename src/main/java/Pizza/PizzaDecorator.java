package Pizza;

public abstract class PizzaDecorator implements Pizza{

    Pizza pizza;
    PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String description() {
      return  pizza.description();
    }

    @Override
    public int price() {
        return pizza.price();
    }
}
