package adapter.classadapter;

//Shape 동작에 맞게 구현된 클래스
public class LineShape implements Shape {
    @Override
    public void boundingBox() {
        System.out.println("LineShape.boundingBox");
    }

    @Override
    public Manipulator createManipulator() {
        return new LineManipulator();
    }
}
