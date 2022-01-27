package singleton.lazyinit;

//Singleton
public class LazyInitPrinter {
    private static LazyInitPrinter printer;

    private LazyInitPrinter() {}

    public static LazyInitPrinter getInstance() {
        if(printer == null) {
            printer = new LazyInitPrinter();
        }
        return printer;
    }

    public void print(String string) {
        System.out.println("[lazyInitPrinter] " + string);
    }
}
