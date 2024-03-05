public class PlainTextDocument implements DocumentPrototype {
    String content;

    public PlainTextDocument(String content) {
        this.content = content;
    }

    @Override
    public DocumentPrototype clone() {
        return new PlainTextDocument(this.content);
    }

    @Override
    public void display() {
        System.out.println("Plain Text Document: " + content);
    }
}
