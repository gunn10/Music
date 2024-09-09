package Logging;

public class Main {
    public static void main(String[] args) {
        Context context=new Context(new Console());
        context.execute();
    }
}
