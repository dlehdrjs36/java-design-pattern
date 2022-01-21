package abstractfactory.logitech;

import abstractfactory.factory.Keyboard;

//ProductB2
public class LogitechKeyboard implements Keyboard {
    public LogitechKeyboard(){
        System.out.println("LogitechKeyboard create");
    }
}
