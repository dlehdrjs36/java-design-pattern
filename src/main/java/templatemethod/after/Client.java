package templatemethod.after;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new Plus("number.txt");
        int sumResult = fileProcessor.process();
        System.out.println("sumResult = " + sumResult);

        FileProcessor multiplyFileProcessor = new Multiply("number.txt");
        int multiplyResult = multiplyFileProcessor.process();
        System.out.println("multiplyResult = " + multiplyResult);
    }
}
