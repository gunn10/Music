package Warehouse.Service;

import Warehouse.Model.Item;
import Warehouse.Repository.WarehouseRepository;

import java.util.List;

public class WarehouseService {
    WarehouseRepository warehouseRepository;

    public WarehouseService( WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }
    void add(Item item){
        warehouseRepository.add(item);
    }

    void delete(Item item){
        warehouseRepository.delete(item);
    }
    List<Item> showAll(){
       return warehouseRepository.showAll();

    }
}
