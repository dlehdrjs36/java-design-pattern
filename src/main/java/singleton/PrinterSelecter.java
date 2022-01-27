package singleton;

import singleton.lazyholder.LazyHolderPrinter;
import singleton.lazyinit.LazyInitPrinter;
import singleton.threadsafelazyinit.ThreadSafeLazyInitPrinter;

//Singleton Printer Selecter
public class PrinterSelecter {

    public LazyInitPrinter getLazyInitPrinter() {
        return LazyInitPrinter.getInstance();
    }

    public ThreadSafeLazyInitPrinter getThreadSafeLazyInitPrinter() {
        return ThreadSafeLazyInitPrinter.getInstance();
    }

    public LazyHolderPrinter getLazyHolderPrinter() {
        return LazyHolderPrinter.getInstance();
    }
}
