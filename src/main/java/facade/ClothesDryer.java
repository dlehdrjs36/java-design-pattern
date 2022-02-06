package facade;

/* 의류 건조기 내부 구성요소를 간략하게 팬, 컨덴서, 히터로 가정한다 */
//Facade
public class ClothesDryer {
    private final Condenser condenser;
    private final Fan fan;
    private final Heater heater;

    public ClothesDryer() {
        this.condenser = new Condenser();
        this.fan = new Fan();
        this.heater = new Heater();
    }

    public void start() {
        this.condenser.start();
        this.fan.start();
        this.heater.start();
    }
}
