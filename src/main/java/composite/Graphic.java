package composite;

//Component
public abstract class Graphic {
    public abstract void draw();
    public Graphic getChild(int i) {
        return null;
    };
    public abstract void add(Graphic graphic);
    public abstract void remove(Graphic graphic);
}
