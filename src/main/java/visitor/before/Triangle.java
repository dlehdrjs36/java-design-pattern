package visitor.before;

public class Triangle implements Shape {
    @Override
    public void printTo(Device device) {
        if (device instanceof Phone) {
            System.out.println("print Triangle to Phone");
            System.out.println("---");
        } else if (device instanceof Watch) {
            System.out.println("print Triangle to Watch");
            System.out.println("---");
        }
    }
}
