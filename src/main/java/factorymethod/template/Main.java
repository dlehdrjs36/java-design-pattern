package factorymethod.template;

public class Main {
    public static void main(String[] args) {
        //템플릿 클래스를 이용하여 클래스 계통의 부피가 확장되는 문제 해결
        Application myApplication = new StandardApplication<MyDocument>(MyDocument.class);
        Document document = myApplication.createDocument();
        document.open();
        document.close();

        myApplication = new StandardApplication<YourDocument>(YourDocument.class);
        document = myApplication.createDocument();
        document.open();
        document.close();

        //Document를 상속받은 제품만 생성가능. 컴파일 시 에러 검출이 가능하다.
        //myApplication = new StandardApplication<DefaultDocument>(DefaultDocument.class); 컴파일 에러 검출 ㅇ
        //Raw Type을 사용하면 컴파일 시점에 에러검출이 되지않고 런타임에 발생할 수 있으니 사용을 자제해야한다.
        //myApplication = new StandardApplication(DefaultDocument.class); 컴파일 에러 검출 X
    }
}
