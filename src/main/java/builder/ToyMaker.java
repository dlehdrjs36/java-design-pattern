package builder;

//Director
public class ToyMaker {
    private final ToyBuilder toyBuilder;

    public ToyMaker(ToyBuilder toyBuilder) {
        this.toyBuilder = toyBuilder;
    }

    public Toy getToy() {
        return this.toyBuilder.getToy();
    }

    public void constructToy(){
        this.toyBuilder.buildType();
        this.toyBuilder.buildHair();
        this.toyBuilder.buildDress();
        this.toyBuilder.buildShoes();
    }
}
