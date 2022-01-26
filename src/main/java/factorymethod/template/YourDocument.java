package factorymethod.template;

//ConcreteProduct
public class YourDocument implements Document {
    @Override
    public void open() {
        System.out.println("YourDocument.open");
    }

    @Override
    public void close() {
        System.out.println("YourDocument.close");
    }

    @Override
    public void save() {
        System.out.println("YourDocument.save");
    }

    @Override
    public void revert() {
        System.out.println("YourDocument.revert");
    }
}
