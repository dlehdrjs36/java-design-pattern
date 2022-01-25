package factorymethod.parameterizedfactorymethod;

/**
 * 팩토리 메소드의 매개변수화
 * 여러 종류의 제품을 생성할 수 있다.
 * 매개변수를 통해서 생성할 제품을 결정한다.
 * 매개변수화된 팩토리 메서드를 오버라이드하면, Creator 클래스가 생성하는 제품을 쉽게 확장하거나 변경할 수 있다.
 **/
//Creator
public interface Application {
    Document createDocument(String id);//팩토리 메서드
    default void newDocument(){
        System.out.println("Application.newDocument");
    }
    default void openDocument(){
        System.out.println("Application.openDocument");
    }
}
