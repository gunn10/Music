package DatabaseManagementusingDIP.Service;

import DatabaseManagementusingDIP.Model.Database;

public class DatabaseService {
    Database database;

    public DatabaseService(Database database) {
        this.database = database;
    }
    void create(){
        database.create();
    }
    void update(){
        database.update();
    }
    void insert(){
        database.insert();
    }
    void retrieve(){
        database.retrieve();
    }
}
