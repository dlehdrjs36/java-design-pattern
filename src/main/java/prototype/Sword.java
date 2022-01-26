package prototype;

//ConcretePrototype
public class Sword extends Item {

    @Override
    protected Sword clone() throws CloneNotSupportedException {
        System.out.print(this + "-[검 획득] ");
        return (Sword) super.clone();
    }

    @Override
    void use() {
        System.out.println(this + "-[검 사용-검 공격]");
    }
}
