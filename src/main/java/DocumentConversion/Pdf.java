package DocumentConversion;

public class Pdf extends Document{
    @Override
    public void open() {
        System.out.println("Pdf opened");
    }

    @Override
    public void read() {
        System.out.println("Pdf read");
    }
}
