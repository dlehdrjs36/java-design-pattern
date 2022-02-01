package bridge;

//RefindAbstraction
public class Crow extends Animal {
    protected Crow(Behavior behavior) {
        super(behavior);
    }

    @Override
    public void info() {
        System.out.println("까마귀");
    }

    public void crowMove() {
        super.move();
    }

    public void crowAttack() {
        super.attack();
    }
}
