package proxy;

//RealSubject
public class GameServiceImpl implements GameService {
    @Override
    public void startGame() {
        System.out.println("게임 시작");
    }
}
