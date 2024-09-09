package DatabaseManagementusingDIP.Factory;

import DatabaseManagementusingDIP.Model.Database;
import DatabaseManagementusingDIP.Model.Mysql;

public class MysqlFactory implements DatabaseFactory {
    @Override
    public Database factoryMethod() {
        return new Mysql();
    }
}
