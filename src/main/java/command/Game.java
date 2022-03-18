package command;

//receiver
public class Game {

    private boolean isOn;

    public void start() {
        System.out.println("게임 시작");
        this.isOn = true;
    }

    public void end() {
        System.out.println("게임 종료");
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }
}
