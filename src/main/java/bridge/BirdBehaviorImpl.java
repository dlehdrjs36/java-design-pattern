package bridge;

//ConcreteImplementorA
public class BirdBehaviorImpl implements Behavior {
    @Override
    public void move() {
        System.out.println("날기");
    }

    @Override
    public void attack() {
        System.out.println("쪼기");
    }
}
