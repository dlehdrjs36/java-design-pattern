package templatemethod.before;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int sumResult = fileProcessor.process();
        System.out.println("sumResult = " + sumResult);

        MultiplyFileProcessor multiplyFileProcessor = new MultiplyFileProcessor("number.txt");
        int multiplyResult = multiplyFileProcessor.process();
        System.out.println("multiplyResult = " + multiplyResult);
    }
}
