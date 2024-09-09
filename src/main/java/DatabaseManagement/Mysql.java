package DatabaseManagement;

public class Mysql extends Database{

    @Override
    public void accept(DatabaseVisitor databaseVistor) {
    databaseVistor.visit(this);
    }
}
