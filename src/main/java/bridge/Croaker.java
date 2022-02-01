package bridge;

//RefindAbstraction
public class Croaker extends Animal {
    protected Croaker(Behavior behavior) {
        super(behavior);
    }

    @Override
    public void info() {
        System.out.println("조기");
    }

    public void croakerMove() {
        super.move();
    }

    public void croakerAttack() {
        super.attack();
    }
}
