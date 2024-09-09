package DatabaseManagement;

public class InsertVisitor extends DatabaseVisitor{
    @Override
    void visit(Mysql mysql) {
        System.out.println("Insertion in Mysql");
    }
    @Override
    void visit(Mongodb mongodb) {
        System.out.println("Insertion in Mongodb");
    }
    @Override
    void visit(PLSQL plsql) {
        System.out.println("Insertion in PLSQL");
    }
}
