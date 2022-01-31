package adapter.objectadapter;

public class Main {
    public static void main(String[] args) {
        DrawingEditor drawingEditor = new DrawingEditor();
        //기존 인터페이스에 맞게 구현된 기능
        LineShape lineShape = new LineShape();
        drawingEditor.setShape(lineShape);
        lineShape.boundingBox();

        //기존과 호환되지않는 TextView 기능을 Adapter를 적용하여 호환되도록 만든다
        Shape textShape = new TextShape();
        drawingEditor.setShape(textShape);
        drawingEditor.boundingBox();
    }
}
