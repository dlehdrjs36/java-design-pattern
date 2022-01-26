package prototype;

//ConcretePrototype
public class ManaPotion extends Item {

    @Override
    protected ManaPotion clone() throws CloneNotSupportedException {
        System.out.print(this + "-[마나 물약 획득] ");
        return (ManaPotion) super.clone();
    }

    @Override
    void use() {
        System.out.println(this + "-[마나 물약 사용-마나 회복]");
    }
}
