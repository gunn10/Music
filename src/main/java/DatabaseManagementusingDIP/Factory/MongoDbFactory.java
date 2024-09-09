package DatabaseManagementusingDIP.Factory;

import DatabaseManagementusingDIP.Model.Database;
import DatabaseManagementusingDIP.Model.MongoDb;

public class MongoDbFactory implements DatabaseFactory {
    @Override
    public Database factoryMethod() {
        return new MongoDb();
    }
}
