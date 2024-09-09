package DatabaseManagement;

public abstract class DatabaseVisitor {
    abstract void visit(Mysql mysql);
   abstract void visit(Mongodb mongodb);
   abstract void visit(PLSQL plsql);
}
