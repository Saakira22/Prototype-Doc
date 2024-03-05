public class HTMLDocument implements DocumentPrototype {
    String content;

    public HTMLDocument(String content) {
        this.content = content;
    }

    @Override
    public DocumentPrototype clone() {
        return new HTMLDocument(this.content);
    }

    @Override
    public void display() {
        System.out.println("HTML Document: " + content);
    } 
}
