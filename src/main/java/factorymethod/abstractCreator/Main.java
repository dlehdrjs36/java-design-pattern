package factorymethod.abstractCreator;

public class Main {
    public static void main(String[] args) {
        Application myApplication = new MyApplication();
        Document document = myApplication.createDocument();
        document.open();
        document.close();

        myApplication = new YourApplication();
        document = myApplication.createDocument();
        document.open();
        document.close();
    }
}
