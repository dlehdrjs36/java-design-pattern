package factorymethod.concreteCreator;

/**
 * Creator 를 구체 클래스로 정의하고 팩토리 메서드에 대한 구현 제공
 * 구체적으로 자신이 생성할 제품을 알고있다.
 * -> Creator의 팩토리 메서드를 통해 제품을 생성할 수 있다.
 **/
//Creator
public class Application {
    public Document createDocument() {//팩토리 메서드
        return new MyDocument();
    }
    public void newDocument() {
        System.out.println("Application.newDocument");
    }
    public void openDocument() {
        System.out.println("Application.openDocument");
    }
}
