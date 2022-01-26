package factorymethod.template;

import java.lang.reflect.InvocationTargetException;

/**
 * Creator 클래스의 서브클래스가 되는 템플릿 클래스를 이용하여 Product를 추가할 때 마다 서브클래싱하는 문제를 해결한다.
 * 템플릿 클래스를 이용하면 Creator를 상속받는 서브클래스를 추가로 정의할 필요없이 적절한 Product 클래스만 준비하면 된다.
 */
//ConcreteCreator
public class StandardApplication<T extends Document> implements Application {
    private final Class<T> t;

    public StandardApplication(Class<T> t) {
        this.t = t;
    }

    @Override
    public Document createDocument() {
        Document document = null;
        try {
            document = this.t.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return document;
    }
}
