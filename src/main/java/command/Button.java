package command;

import java.util.Stack;

//invoker
public class Button {

    private final Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.empty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    //main 메서드는 Button 클래스 밖의 외부 코드라고 가정한다.
    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }
}
