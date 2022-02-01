package bridge;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Croaker(new FishBehaviorImpl());
        animal.info();
        animal.move();
        animal.attack();
        System.out.println("-----------------------------------");
        animal = new Crow(new BirdBehaviorImpl());
        animal.info();
        animal.move();
        animal.attack();
    }
}
