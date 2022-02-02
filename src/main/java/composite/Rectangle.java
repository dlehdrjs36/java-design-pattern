package composite;

//Leaf
public class Rectangle extends Graphic {
    @Override
    public void draw() {
        System.out.println("draw Rectangle");
    }

    @Override
    public void add(Graphic graphic) {
        System.out.println("can't add");
    }

    @Override
    public void remove(Graphic graphic) {
        System.out.println("can't remove");
    }
}
