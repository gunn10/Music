package DatabaseManagement;

public abstract class Database {
    abstract  void accept(DatabaseVisitor databaseVistor);
}
