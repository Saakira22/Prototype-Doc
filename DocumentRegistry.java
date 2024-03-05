public class DocumentRegistry {
    private static final String PLAIN_TEXT_KEY = "plain";
    private static final String HTML_KEY = "html";

    private static final DocumentPrototype plainTextPrototype = new PlainTextDocument("");
    private static final DocumentPrototype htmlPrototype = new HTMLDocument("");

    // Get a cloned document instance by type
    public static DocumentPrototype getDocument(String type, String content) {
        if (type.equalsIgnoreCase(PLAIN_TEXT_KEY)) {
            PlainTextDocument clonedDocument = (PlainTextDocument) plainTextPrototype.clone();
            clonedDocument.content = content;
            return clonedDocument;
        } else if (type.equalsIgnoreCase(HTML_KEY)) {
            HTMLDocument clonedDocument = (HTMLDocument) htmlPrototype.clone();
            clonedDocument.content = content;
            return clonedDocument;
        }
        throw new IllegalArgumentException("Invalid document type");
    }
}
