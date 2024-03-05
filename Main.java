public class Main {
    public static void main(String[] args) {
        // Create and display cloned instances of documents from the registry
        DocumentPrototype plainTextDocument = DocumentRegistry.getDocument("plain", "This is a plain text document.");
        DocumentPrototype htmlDocument = DocumentRegistry.getDocument("html", "<html><body><h1>This is an HTML document.</h1></body></html>");
        plainTextDocument.display();
        htmlDocument.display();
    }
}
