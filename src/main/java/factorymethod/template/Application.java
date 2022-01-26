package factorymethod.template;

/**
 * 템플릿을 사용하여 팩토리 메서드의 서브클래싱 피하기
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
