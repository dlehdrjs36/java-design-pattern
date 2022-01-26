package prototype;

//ConcretePrototype
public class Apple extends Item {

    @Override
    protected Apple clone() throws CloneNotSupportedException {
        System.out.print(this + "-[사과 획득] ");
        return (Apple) super.clone();
    }

    @Override
    void use() {
        System.out.println(this + "-[사과 사용-포만감 회복]");
    }
}
