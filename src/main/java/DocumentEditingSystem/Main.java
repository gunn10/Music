package DocumentEditingSystem;

public class Main {
    public static void main(String[] args) {
        Document textdocument = new TextDocument("TextDocument");
        DocumentService documentService = new DocumentService(textdocument);
        documentService.openDocument();
        documentService.printDocument();
        documentService.saveDocument();


        Document readDocument=new ReadOnlyDocument("Read Only Document");
        DocumentService documentService1=new DocumentService(readDocument);
        documentService1.saveDocument();
        documentService1.printDocument();
        documentService1.openDocument();

    }
}
