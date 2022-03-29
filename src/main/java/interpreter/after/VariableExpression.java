package interpreter.after;

import java.util.Map;

//TerminalExpression
public class VariableExpression implements PostfixExpression {

    private final Character variable;

    public VariableExpression(Character variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(this.variable);
    }
}
