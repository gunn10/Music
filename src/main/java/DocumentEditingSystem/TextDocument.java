package DocumentEditingSystem;

public class TextDocument extends Document implements  PrintDocument,SaveDocument,OpenDocument{

    TextDocument(String type){
        super(type);
    }
    @Override
    public void save(){
        System.out.println("Text Document can be saved");
    }

    @Override
    public void open() {
        System.out.println("Text Document can be opened");
    }

    @Override
    public void print() {
        System.out.println("Text Document can be printed");
    }
}
