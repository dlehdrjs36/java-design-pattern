package interpreter.before;

import java.util.Stack;

public class PostfixNotation {

    private final String expression;

    public PostfixNotation(String expression) {
        this.expression = expression;
    }

    private void calculate() {
        Stack<Integer> numbers = new Stack<>();

        for (char c : this.expression.toCharArray()) {
            switch (c) {
                case '+':
                    numbers.push(numbers.pop() + numbers.pop());
                    break;
                case '-':
                    int right = numbers.pop();
                    int left = numbers.pop();
                    numbers.push(left - right);
                    break;
                default:
                    numbers.push(Integer.parseInt(c + ""));
            }
        }
        System.out.println(numbers.pop());
    }

    public static void main(String[] args) {
        PostfixNotation postfixNotation1 = new PostfixNotation("123+-"); // 123 대신에 다른 숫자로 바꿔서 계산하는 문제를 자주 사용한다면?
        PostfixNotation postfixNotation2 = new PostfixNotation("456+-");
        PostfixNotation postfixNotation3 = new PostfixNotation("789+-");

        postfixNotation1.calculate();
        postfixNotation2.calculate();
        postfixNotation3.calculate();
    }
}
