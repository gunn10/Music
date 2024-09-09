package Warehouse.Model;

import java.util.List;

public class Warehouse {

    List<Item> items;

    public Warehouse(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "items=" + items +
                '}';
    }
}
