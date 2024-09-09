package DatabaseManagement;

public class PLSQL extends Database{
    @Override
    public void accept(DatabaseVisitor databaseVistor) {
        databaseVistor.visit(this);
    }
}
