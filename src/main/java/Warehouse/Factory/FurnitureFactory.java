package Warehouse.Factory;

import Warehouse.Model.Furniture;

public class FurnitureFactory implements ItemFactory {
    public Furniture factoryMethod(String type, int stock){
        return new Furniture(type,stock);
    }
}
