package visitor.after;

//Concrete Visitor
public class Watch implements Device {
    @Override
    public void print(Triangle circle) {
        System.out.println("print Triangle to Watch");
        System.out.println("---");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print Rectangle to Watch");
        System.out.println("---");
    }
}
