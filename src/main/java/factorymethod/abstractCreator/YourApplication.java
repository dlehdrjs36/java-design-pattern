package factorymethod.abstractCreator;

//ConcreteCreator
public class YourApplication implements Application {
    @Override
    public Document createDocument() {//팩토리 메서드
        return new YourDocument();
    }
}
