package factorymethod.concreteCreator;

//ConcreteProduct
public class MyDocument implements Document {
    @Override
    public void open() {
        System.out.println("MyDocument.open");
    }

    @Override
    public void close() {
        System.out.println("MyDocument.close");
    }

    @Override
    public void save() {
        System.out.println("MyDocument.save");
    }

    @Override
    public void revert() {
        System.out.println("MyDocument.revert");
    }
}
