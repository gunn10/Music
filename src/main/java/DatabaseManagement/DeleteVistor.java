package DatabaseManagement;

public class DeleteVistor extends DatabaseVisitor{
    @Override
    void visit(Mysql mysql) {
        System.out.println("Deletion in Mysql");
    }
    @Override
    void visit(Mongodb mongodb) {
        System.out.println("Deletion in Mongodb");
    }
    @Override
    void visit(PLSQL plsql) {
        System.out.println("Deletion in PLSQL");
    }
}
