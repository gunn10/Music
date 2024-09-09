package DatabaseManagement;

public class Mongodb extends Database{
    @Override
    public void accept(DatabaseVisitor databaseVistor) {
        databaseVistor.visit(this);
    }
}
