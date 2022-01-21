package abstractfactory.logitech;

import abstractfactory.factory.Mouse;
//ProductA2
public class LogitechMouse implements Mouse {
    public LogitechMouse(){
        System.out.println("LogitechMouse create");
    }
}
