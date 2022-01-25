package factorymethod.parameterizedfactorymethod;

//ConcreteProduct
public class DefaultDocument implements Document {
    @Override
    public void open() {
        System.out.println("DefaultDocument.open");
    }

    @Override
    public void close() {
        System.out.println("DefaultDocument.close");
    }

    @Override
    public void save() {
        System.out.println("DefaultDocument.save");
    }

    @Override
    public void revert() {
        System.out.println("DefaultDocument.revert");
    }
}
