package factorymethod.concreteCreator;

//Product
public interface Document {
    void open();
    void close();
    void save();
    void revert();
}
