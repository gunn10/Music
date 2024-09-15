package TextEditorSystem;

public class Italic extends TextDecorator{
    Italic(Text text) {
        super(text);
    }

    @Override
    public String text() {
        return super.text() +" "+ "Italic text";
    }
}
