package factorymethod.template;

public class DefaultDocument {
    public void open() {
        System.out.println("DefaultDocument.open");
    }

    public void close() {
        System.out.println("DefaultDocument.close");
    }

    public void save() {
        System.out.println("DefaultDocument.save");
    }

    public void revert() {
        System.out.println("DefaultDocument.revert");
    }
}
