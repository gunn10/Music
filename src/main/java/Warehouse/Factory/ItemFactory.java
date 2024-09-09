package Warehouse.Factory;

import Warehouse.Model.Item;

public interface ItemFactory {
    Item factoryMethod(String type, int stock);
}
