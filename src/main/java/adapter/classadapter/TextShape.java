package adapter.classadapter;

//Adapter
//Shape 인터페이스에 호환되지 않는 기존에 존재하던 텍스트 관련 그리기 기능을 이용하는 클래스
//즉, 호환되지 않는 기능을 Adapter를 통하여 호환성 있도록 변경
public class TextShape extends TextView implements Shape {

    @Override
    public void boundingBox() {
        getExtent();
    }

    @Override
    protected void getExtent() {//Adaptee 메서드 재정의가 쉽다.
        super.getExtent();
    }

    @Override
    public Manipulator createManipulator() {
        //애초에 Shape의 Manipulator와 조작방식이 다르기 떄문에 해당 텍스트를 관리하는 조작자 동작을 별도로 정의 해야한다.
        return new TextManipulator();
    }
}
