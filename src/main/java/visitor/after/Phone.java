package visitor.after;

//Concrete Visitor
public class Phone implements Device {
    @Override
    public void print(Triangle circle) {
        System.out.println("print Triangle to Phone");
        System.out.println("---");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print Rectangle to Phone");
        System.out.println("---");
    }
}
