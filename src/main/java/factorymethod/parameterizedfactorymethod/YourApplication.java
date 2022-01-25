package factorymethod.parameterizedfactorymethod;

//ConcreteCreator
public class YourApplication implements Application {
    @Override
    public Document createDocument(String id) {//팩토리 메서드
        if(id.equals("my")) return new YourDocument();
        if(id.equals("your")) return new MyDocument();

        return new DefaultDocument();
    }
}
