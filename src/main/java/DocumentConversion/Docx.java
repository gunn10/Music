package DocumentConversion;

public class Docx extends Document{
    @Override
    public void open() {
        System.out.println("Docx opened");
    }

    @Override
    public void read() {
        System.out.println("Docx read");
    }
}
