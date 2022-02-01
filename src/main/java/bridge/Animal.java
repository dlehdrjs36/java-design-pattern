package bridge;

//Abstraction
public abstract class Animal {
    private Behavior behavior;

    protected Animal(Behavior behavior) {
        this.behavior = behavior;
    }

    public abstract void info();

    public void move() {
        this.behavior.move();
    }

    public void attack() {
        this.behavior.attack();
    }
}