package bridge;

//ConcreteImplementorB
public class FishBehaviorImpl implements Behavior {
    @Override
    public void move() {
        System.out.println("헤엄치기");
    }

    @Override
    public void attack() {
        System.out.println("깨물기");
    }
}
