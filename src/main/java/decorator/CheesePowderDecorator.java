package decorator;

//ConcreteDecoratorB
public class CheesePowderDecorator extends PizzaDecorator {
    protected CheesePowderDecorator(PizzaPlace pizzaPlace) {
        super(pizzaPlace);
    }

    @Override
    public String createPizza() {
        return super.createPizza() + addCheesePowder();
    }

    @Override
    public int calculate() {
        return super.calculate() + 2000;
    }

    //Component에 정의된 연산만을 인터페이스로 바라보고 요청하기 위해서 private로 설정
    private String addCheesePowder() {
        return " + Cheese Powder";
    }
}
