package decorator;

//Decorator
public abstract class PizzaDecorator implements PizzaPlace {
    private final PizzaPlace pizzaPlace;

    protected PizzaDecorator(PizzaPlace pizzaPlace) {
        this.pizzaPlace = pizzaPlace;
    }

    @Override
    public String createPizza() {
        return pizzaPlace.createPizza();
    }

    @Override
    public int calculate() {
        return pizzaPlace.calculate();
    }

}
