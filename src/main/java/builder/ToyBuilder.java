package builder;

//Builder
public abstract class ToyBuilder {
    public abstract void buildType();
    public abstract void buildHair();
    public abstract void buildDress();
    public abstract void buildShoes();
    public abstract Toy getToy();
}