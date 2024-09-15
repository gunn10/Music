package DocumentConversion;

public class RTF extends Document{
    @Override
    public void open() {
        System.out.println("RTF opened");
    }

    @Override
    public void read() {
        System.out.println("RTF read");
    }
}
