package factorymethod.abstractCreator;

//Product
public interface Document {
    void open();
    void close();
    void save();
    void revert();
}
