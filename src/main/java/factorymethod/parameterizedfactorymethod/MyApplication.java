package factorymethod.parameterizedfactorymethod;

//ConcreteCreator
public class MyApplication implements Application {
    @Override
    public Document createDocument(String id) {//팩토리 메서드
        if(id.equals("my"))  return new MyDocument();
        if(id.equals("your"))  return new YourDocument();

        return new DefaultDocument();
    }
}
