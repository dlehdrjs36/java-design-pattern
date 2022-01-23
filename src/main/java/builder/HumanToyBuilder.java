package builder;

//ConcreateBuilder
public class HumanToyBuilder extends ToyBuilder {
    private final Toy toy;

    public HumanToyBuilder() {
        this.toy = new Toy();
    }

    @Override
    public void buildType() {
        toy.setType("Human");
    }

    @Override
    public void buildHair() {
        toy.setHair("yello hair");
    }

    @Override
    public void buildDress() {
        toy.setDress("black dress");
    }

    @Override
    public void buildShoes() {
        toy.setShoes("sneakers");
    }

    @Override
    public Toy getToy() {
        return this.toy;
    }
    
}
