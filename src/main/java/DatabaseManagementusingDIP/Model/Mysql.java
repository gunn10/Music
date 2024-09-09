package DatabaseManagementusingDIP.Model;

public class Mysql implements Database {
    @Override
    public void create() {
        System.out.println("Created in Mysql");
    }

    @Override
    public void insert() {
        System.out.println("Inserted in mysql");
    }

    @Override
    public void update() {
        System.out.println("Updated in mysql");
    }

    @Override
    public void retrieve() {
        System.out.println("Data retrieved from mysql");
    }
}
