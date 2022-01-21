package abstractfactory;

import abstractfactory.factory.HardwareFactory;
import abstractfactory.logitech.LogitechFactory;
import abstractfactory.razer.RazerFactory;

public class Main {
    public static void main(String[] args) {
        //초기 로지텍 팩토리로 한 경우
        HardwareFactory hardwareFactory = new LogitechFactory();
        hardwareFactory.createMouse();
        hardwareFactory.createKeyboard();
        System.out.println("----------------------");
        //레이저 팩토리로 교체 후 생성
        hardwareFactory = new RazerFactory();
        hardwareFactory.createMouse();
        hardwareFactory.createKeyboard();
    }
}
