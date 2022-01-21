package abstractfactory.razer;

import abstractfactory.factory.Keyboard;
import abstractfactory.factory.HardwareFactory;
import abstractfactory.factory.Mouse;

//ConcreteFactory1
public class RazerFactory implements HardwareFactory {

    @Override
    public Mouse createMouse(){
        return new RazerMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new RazerKeyboard();
    }

}
