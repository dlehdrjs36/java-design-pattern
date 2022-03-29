package interpreter.after;

import java.util.Map;

//AbstractExpression
public interface PostfixExpression {

    int interpret(Map<Character, Integer> context);

}
