package factorymethod.template;

//Product
public interface Document {
    void open();
    void close();
    void save();
    void revert();
}
