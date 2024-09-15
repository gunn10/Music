package DocumentConversion;

public class Main {
    public static void main(String[] args) {
        Document pdfDocument=new Pdf();
        pdfDocument.sequence();
        Document docxDocument=new Docx();
        docxDocument.sequence();
    }
}
