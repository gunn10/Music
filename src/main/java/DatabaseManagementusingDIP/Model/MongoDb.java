package DatabaseManagementusingDIP.Model;

public class MongoDb implements Database {
    @Override
    public void create() {
        System.out.println("Created in Mongodb");
    }

    @Override
    public void insert() {
        System.out.println("Inserted in Mongodb");
    }

    @Override
    public void update() {
        System.out.println("Updated in Mongodb");
    }

    @Override
    public void retrieve() {
        System.out.println("Data retrieved from Mongodb");
    }
}
