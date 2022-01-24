package factorymethod.concreteCreator;

/**
 * Creator가 알고 있는 제품을 변경할 수 있다.
 */
//ConcreteCreator
public class YourApplication extends Application {
    @Override
    public Document createDocument() {
        return new YourDocument();
    }
}
