package Warehouse.Service;

import Warehouse.Factory.ElectronicsFactory;
import Warehouse.Factory.ItemFactory;
import Warehouse.Model.Item;
import Warehouse.Repository.WarehouseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseServiceTest {

    private WarehouseRepository warehouseRepository;
    private WarehouseService warehouseService;

    @BeforeEach
    void setUp() {
        // Initialize the repository and service
        warehouseRepository = new WarehouseRepository();
        warehouseService = new WarehouseService(warehouseRepository);
    }

    @Test
    void testAddItem() {
        // Given
        ItemFactory electronicsitemFactory=new ElectronicsFactory();
        Item item1= electronicsitemFactory.factoryMethod("Electronics",5);

        // When
        warehouseService.add(item1);

        // Then
        List<Item> items = warehouseRepository.showAll();
        assertTrue(items.contains(item1), "Item should be added to the repository");
    }

    @Test
    void testDeleteItem() {
        ItemFactory electronicsitemFactory=new ElectronicsFactory();
        Item item1= electronicsitemFactory.factoryMethod("Electronics",5);
        // Given
        warehouseService.add(item1);

        // When
        warehouseService.delete(item1);

        // Then
        List<Item> items = warehouseRepository.showAll();
        assertFalse(items.contains(item1), "Item should be removed from the repository");
    }

    @Test
    void testShowAllItems() {
        // Given
        // Items created in the constructor of WarehouseRepository should be present
        List<Item> initialItems = warehouseRepository.showAll();

        // When
        List<Item> items = warehouseService.showAll();

        // Then
        assertEquals(initialItems.size(), items.size(), "The repository should contain the initial items");
        assertEquals(initialItems, items, "Items in the repository should match the initial items");
    }
}
