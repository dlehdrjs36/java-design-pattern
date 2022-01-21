package abstractfactory.razer;

import abstractfactory.factory.Mouse;
//ProductA1
public class RazerMouse implements Mouse {
    public RazerMouse(){
        System.out.println("RazerMouse create");
    }
}