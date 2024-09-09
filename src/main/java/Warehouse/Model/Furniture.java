package Warehouse.Model;

public class Furniture extends Item {
public Furniture(String type, int stock){
    super(type,stock);

}

    @Override
    public String toString() {
        return "Furniture{" +
                "type='" + type + '\'' +
                ", stock=" + stock +
                '}';
    }
}
