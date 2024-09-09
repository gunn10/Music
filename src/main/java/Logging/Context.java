package Logging;

public class Context {
    Logging logging;
   public Context(Logging logging){
        this.logging=logging;
    }
    void execute(){
       logging.log();
    }
}
