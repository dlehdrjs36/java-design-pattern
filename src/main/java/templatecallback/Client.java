package templatecallback;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process((sum, number) -> sum += number);
        System.out.println("result = " + result);

        int multiplyResult = fileProcessor.process((multiply, number) -> multiply *= number);
        System.out.println("multiplyResult = " + multiplyResult);
    }
}
