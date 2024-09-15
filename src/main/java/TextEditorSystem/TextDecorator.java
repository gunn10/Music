package TextEditorSystem;

public abstract class TextDecorator implements Text {
    Text text;
    TextDecorator(Text text){
        this.text=text;
    }
    public String text(){
        return text.text();
    }
}
