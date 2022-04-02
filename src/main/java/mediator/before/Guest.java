package mediator.before;

public class Guest {

    private final Restaurant restaurant = new Restaurant();

    private final CleaningService cleaningService = new CleaningService();

    public void dinner() {
        restaurant.dinner(this);
    }

    public void getTower(int numberOfTower) {
        cleaningService.getTower(this, numberOfTower);
    }

}
