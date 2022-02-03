package decorator;

public class Main {
    public static void main(String[] args) {
        //기존에 만들어져 있는 cheese pizza
        PizzaPlace cheesePizza = new CheesePizza();
        System.out.println(cheesePizza.createPizza());
        System.out.println("금액 : " + cheesePizza.calculate() + "원");

        //Decorator를 사용하여 cheese powder를 뿌린 cheese pizza 생성
        //사용자는 장식자의 존재 자체를 알 수 없다. 사용자는 Component 인터페이스를 통해서 자신의 정보를 접근하기 때문이며 장식자는 해당 인터페이스를 만족한다. 해당 인터페이스는 장식자에서 구체적으로 어떤 기능이 추가되는지는 모른다.
        //장식자에서 실제로 추가되는 기능(addCheesePowder())은 사용자가 인터페이스를 통해서 요청한 것을 장식자가 요청을 가로챈 후에 장식자 본인이 직접 해당 기능을 호출한다.
        PizzaPlace cheesePowderDecorator = new CheesePowderDecorator(cheesePizza);
        System.out.println(cheesePowderDecorator.createPizza());
        System.out.println("금액 : " + cheesePowderDecorator.calculate() + "원");

        //Decorator를 사용하여 hot sauce를 뿌린 cheese pizza 생성
        //사용자는 장식자의 존재 자체를 알 수 없다. 사용자는 Component 인터페이스를 통해서 자신의 정보를 접근하기 때문이며 장식자는 해당 인터페이스를 만족한다. 해당 인터페이스는 장식자에서 구체적으로 어떤 기능이 추가되는지는 모른다.
        //장식자에서 실제로 추가되는 기능(addHotSauce())은 사용자가 인터페이스를 통해서 요청한 것을 장식자가 요청을 가로챈 후에 장식자 본인이 직접 해당 기능을 호출한다.
        PizzaPlace hotSauceDecorator = new HotSauceDecorator(cheesePizza);
        System.out.println(hotSauceDecorator.createPizza());
        System.out.println("금액 : " + hotSauceDecorator.calculate() + "원");

        //Decorator의 조합으로 hot sauce와 cheese powder를 모두 뿌리는 새로운 기능 획득. 새로운 cheese pizza 생성
        PizzaPlace hotSauceCheesePowderDecorator = new HotSauceDecorator(new CheesePowderDecorator(cheesePizza));
        System.out.println(hotSauceCheesePowderDecorator.createPizza());
        System.out.println("금액 : " + hotSauceCheesePowderDecorator.calculate() + "원");

        //hot sauce 두 번 뿌린 cheese pizza
        PizzaPlace doubleHotSauceDecorator = new HotSauceDecorator(new HotSauceDecorator(cheesePizza));
        System.out.println(doubleHotSauceDecorator.createPizza());
        System.out.println("금액 : " + doubleHotSauceDecorator.calculate() + "원");
    }
}
