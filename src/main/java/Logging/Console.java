package Logging;

public class Console implements Logging{
    @Override
    public void log() {
        System.out.println("Logs on console");
    }
}
