package decorator;

public class CheesePizza implements PizzaPlace {
    @Override
    public String createPizza() {
        return "Cheese Pizza";
    }

    @Override
    public int calculate() {
        return 10000;
    }
}
