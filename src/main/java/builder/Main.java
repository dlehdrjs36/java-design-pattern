package builder;

public class Main {
    public static void main(String[] args) {
        //공 장난감
        ToyMaker ballToyMaker = new ToyMaker(new BallToyBuilder());
        Toy ballToy = ballToyMaker.getToy();
        System.out.println(ballToy);
        ballToyMaker.constructToy();
        System.out.println(ballToy);
        System.out.println("------------------------------------------");
        //인간형 장난감
        ToyMaker humanToyMaker = new ToyMaker(new HumanToyBuilder());
        Toy humanToy = humanToyMaker.getToy();
        System.out.println(humanToy);
        humanToyMaker.constructToy();
        System.out.println(humanToy);
    }
}

