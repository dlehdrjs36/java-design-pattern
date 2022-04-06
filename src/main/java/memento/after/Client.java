package memento.after;

//Caretaker
public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave prevSavePoint = game.save();

        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);

        GameSave afterSavePoint = game.save();

        game.restore(prevSavePoint);
        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
        System.out.println("==============================");
        game.restore(afterSavePoint);
        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}
