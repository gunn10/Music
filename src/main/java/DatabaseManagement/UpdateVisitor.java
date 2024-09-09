package DatabaseManagement;

public class UpdateVisitor extends DatabaseVisitor{
    @Override
    void visit(Mysql mysql) {
        System.out.println("Updation in Mysql");
    }
    @Override
    void visit(Mongodb mongodb) {
        System.out.println("Updation in Mongodb");
    }
    @Override
    void visit(PLSQL plsql) {
        System.out.println("Updation in PLSQL");
    }
}
