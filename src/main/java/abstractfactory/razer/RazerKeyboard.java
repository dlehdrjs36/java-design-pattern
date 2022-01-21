package abstractfactory.razer;

import abstractfactory.factory.Keyboard;

//ProductB1
public class RazerKeyboard implements Keyboard {
    public RazerKeyboard(){
        System.out.println("RazerKeyboard create");
    }
}
