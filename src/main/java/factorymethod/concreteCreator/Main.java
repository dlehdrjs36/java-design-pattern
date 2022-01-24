package factorymethod.concreteCreator;

public class Main {
    public static void main(String[] args) {
        Application application = new Application();
        Document document = application.createDocument();
        document.open();
        document.close();
    }
}
