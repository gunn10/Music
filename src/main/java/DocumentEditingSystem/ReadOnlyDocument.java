package DocumentEditingSystem;

public class ReadOnlyDocument extends Document implements  OpenDocument,PrintDocument{
    ReadOnlyDocument(String type){
        super(type);
    }
    @Override
    public void print() {
        System.out.println("Read Document can be printed");
    }

    @Override
    public void open() {
        System.out.println("Read Document can be opened");
    }
}
