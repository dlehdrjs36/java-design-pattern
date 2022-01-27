package singleton;

public class Main {

    public static void main(String[] args) {
        PrinterSelecter printerSelecter = new PrinterSelecter();

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 5 ; i++) {
                System.out.println(printerSelecter.getLazyHolderPrinter() + " : " + Thread.currentThread().getName());
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 5 ; i++) {
                System.out.println(printerSelecter.getLazyHolderPrinter() + " : " + Thread.currentThread().getName());
            }
        });
        thread2.start();

        System.out.println(printerSelecter.getLazyHolderPrinter() + " : " + Thread.currentThread().getName());
    }
}
