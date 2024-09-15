package TextEditorSystem;

public class Main {
    public static void main(String[] args) {
        Text plainText=new PlainText();
        Text boldText=new Bold(plainText);
        Text italicText =new Italic(plainText);
        System.out.println(boldText.text());

        //1
        Text italicText2=new Italic(new Bold(new Bold(italicText)));

        System.out.println(italicText.text());
    }
}
