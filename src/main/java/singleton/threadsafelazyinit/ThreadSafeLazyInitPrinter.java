package singleton.threadsafelazyinit;

//Singleton
public class ThreadSafeLazyInitPrinter {
    private static ThreadSafeLazyInitPrinter printer;

    private ThreadSafeLazyInitPrinter() {}

    public static synchronized ThreadSafeLazyInitPrinter getInstance() {
        if(printer == null) {
            printer = new ThreadSafeLazyInitPrinter();
        }
        return printer;
    }

    public void print(String string) {
        System.out.println("[threadSafeLazyInitPrinter]" + string);
    }
}
