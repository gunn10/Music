package Warehouse.Model;

public class Electronics extends Item {
    public Electronics(String type, int stock){
        super(type,stock);
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "type='" + type + '\'' +
                ", stock=" + stock +
                '}';
    }
}
