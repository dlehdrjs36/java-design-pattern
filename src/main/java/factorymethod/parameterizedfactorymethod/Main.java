package factorymethod.parameterizedfactorymethod;

public class Main {
    public static void main(String[] args) {
        Application myApplication = new MyApplication();
        Document document = myApplication.createDocument("my");
        document.open();
        document.close();

        document = myApplication.createDocument("theirs");
        document.open();
        document.close();

        myApplication = new YourApplication();
        document = myApplication.createDocument("my");
        document.open();
        document.close();

        document = myApplication.createDocument("theirs");
        document.open();
        document.close();
    }
}