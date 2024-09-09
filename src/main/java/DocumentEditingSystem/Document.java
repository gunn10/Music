package DocumentEditingSystem;

public abstract class Document {
    String documentType;

    public Document(String documentType) {
        this.documentType = documentType;
    }
}
