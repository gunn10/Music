package Warehouse.Factory;

import Warehouse.Model.Electronics;

public class ElectronicsFactory implements ItemFactory {
    public Electronics factoryMethod(String type, int stock){
        return new Electronics(type,stock);
    }
}
