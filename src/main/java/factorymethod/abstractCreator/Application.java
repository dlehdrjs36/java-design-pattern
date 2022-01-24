package factorymethod.abstractCreator;

/**
 * Creator 를 추상적으로 정의하고 팩토리 메서드에 대한 구현 미제공
 * Product(MyDocument, YourDocument, ...) 추가하려 할 때마다 서브클래싱 필요
 * -> 클래스 계통 부피 확장
 **/
//Creator
public interface Application {
    Document createDocument();//팩토리 메서드
    default void newDocument(){
        System.out.println("Application.newDocument");
    }
    default void openDocument(){
        System.out.println("Application.openDocument");
    }
}
