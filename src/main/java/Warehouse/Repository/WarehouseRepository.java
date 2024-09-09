package Warehouse.Repository;

import Warehouse.Factory.ElectronicsFactory;
import Warehouse.Factory.FurnitureFactory;
import Warehouse.Factory.ItemFactory;
import Warehouse.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class WarehouseRepository {

    List<Item> items;

    public WarehouseRepository() {
        items = new ArrayList<>();
        ItemFactory electronicsitemFactory = new ElectronicsFactory();
        ItemFactory furnitureitemFactory = new FurnitureFactory();
        Item item1 = electronicsitemFactory.factoryMethod("Electronics", 5);
        Item item2 = furnitureitemFactory.factoryMethod("Furniture", 6);
        items.add(item1);
        items.add(item2);
    }

    public void add(Item item) {
        items.add(item);
    }

    public void delete(Item item) {
        items.remove(item);
    }

    public List<Item> showAll() {
        return items;
    }

}
