package DocumentEditingSystem;

public class DocumentService {
    private Document document;

    public DocumentService(Document document) {
        this.document = document;
    }

    public void openDocument() {
        if (document instanceof OpenDocument) {
            ((OpenDocument) document).open();
        } else {
            System.out.println("Operation not allowed: This document cannot be opened.");
        }
    }

    public void saveDocument() {
        if (document instanceof SaveDocument) {
            ((SaveDocument) document).save();
        } else {
            System.out.println("Operation not allowed: This document cannot be saved.");
        }
    }

    public void printDocument() {
        if (document instanceof PrintDocument) {
            ((PrintDocument) document).print();
        } else {
            System.out.println("Operation not allowed: This document cannot be printed.");
        }
    }
}
