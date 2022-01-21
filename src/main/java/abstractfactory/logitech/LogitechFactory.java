package abstractfactory.logitech;

import abstractfactory.factory.HardwareFactory;
import abstractfactory.factory.Keyboard;
import abstractfactory.factory.Mouse;

//ConcreteFactory2
public class LogitechFactory implements HardwareFactory {

    @Override
    public Mouse createMouse() {
        return new LogitechMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new LogitechKeyboard();
    }

}
