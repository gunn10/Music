package Warehouse.Model;

public abstract class Item {
    String type;
    int stock;

    public Item(String type, int stock) {
        this.type = type;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                ", stock=" + stock +
                '}';
    }
}
