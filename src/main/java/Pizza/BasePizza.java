package Pizza;

public class BasePizza implements Pizza{
    @Override
    public String description() {
       return "Base Pizza";
    }

    @Override
    public int price() {
        return 10;
    }
}
