package proxy;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//Proxy
public class GameServiceImplProxy implements GameService {

    private GameService gameService;

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        //lazy init
        if (gameService == null) {
            this.gameService = new GameServiceImpl();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        //게임 로딩 과정
        try {
            for(int i = 0; i <= 100; i++) {
                bufferedWriter.write(String.valueOf(i));
                if(i % 10 == 0) {
                    bufferedWriter.write(System.lineSeparator());
                }
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //게임 로딩 후 게임 시작
        gameService.startGame(); // realSubject -> Request();
        System.out.println(System.currentTimeMillis() - before);

    }
}
