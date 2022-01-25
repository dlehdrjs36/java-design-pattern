package factorymethod.parameterizedfactorymethod;

//Product
public interface Document {
    void open();
    void close();
    void save();
    void revert();
}
