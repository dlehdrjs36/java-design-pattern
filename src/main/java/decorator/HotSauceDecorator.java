package decorator;

//ConcreteDecoratorA
public class HotSauceDecorator extends PizzaDecorator {
    protected HotSauceDecorator(PizzaPlace pizzaPlace) {
        super(pizzaPlace);
    }

    @Override
    public String createPizza() {
        return super.createPizza() + addHotSauce();
    }

    @Override
    public int calculate() {
        return super.calculate() + 1000;
    }

    //Component에 정의된 연산만을 인터페이스로 바라보고 요청하기 위해서 private로 설정
    private String addHotSauce() {
        return " + Hot Sauce";
    }
}
