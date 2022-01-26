package prototype;

//Prototype
public abstract class Item implements Cloneable {
    abstract void use();

    protected Item clone() throws CloneNotSupportedException {
        return (Item) super.clone();
    }
}
