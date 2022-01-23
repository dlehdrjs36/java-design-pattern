package builder;

//ConcreateBuilder
public class BallToyBuilder extends ToyBuilder {
    private final Toy toy;

    public BallToyBuilder(){
        toy = new Toy();
    }

    @Override
    public void buildType() {
        toy.setType("Ball");
    }

    @Override
    public void buildHair() {}

    @Override
    public void buildDress() {}

    @Override
    public void buildShoes() {}

    @Override
    public Toy getToy() {
        return this.toy;
    }
}