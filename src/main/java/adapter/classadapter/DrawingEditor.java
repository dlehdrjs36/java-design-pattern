package adapter.classadapter;

//Client
public class DrawingEditor {
    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void boundingBox() {
        shape.boundingBox();
    }

    public Manipulator createManipulator() {
        return shape.createManipulator();
    }
}
