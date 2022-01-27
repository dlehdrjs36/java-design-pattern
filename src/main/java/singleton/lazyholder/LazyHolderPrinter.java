package singleton.lazyholder;

//Singleton
public class LazyHolderPrinter {
    private LazyHolderPrinter() {}

    private static class InnerInstanceClazz {
        // 클래스 로딩 시점에서 생성
        private static final LazyHolderPrinter uniqueInstance = new LazyHolderPrinter();
    }

    public static LazyHolderPrinter getInstance() {
        return InnerInstanceClazz.uniqueInstance;
    }

    public void print(String string) {
        System.out.println("[LazyHolderPrinter]" + string);
    }
}
