package prototype;

//ConcretePrototype
public class HealthPotion extends Item {

    @Override
    protected HealthPotion clone() throws CloneNotSupportedException {
        System.out.print(this + "-[체력 물약 획득] ");
        return (HealthPotion) super.clone();
    }

    @Override
    void use() {
        System.out.println(this + "-[체력 물약 사용-체력 회복]");
    }
}
