package TextEditorSystem;

public class Bold extends TextDecorator{
    Bold(Text text) {
        super(text);
    }

    @Override
    public String text() {
        return super.text() +" "+ "Bold text";
    }
}
