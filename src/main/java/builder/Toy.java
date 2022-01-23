package builder;

//Product
public class Toy {
    private String type = "";
    private String hair = "";
    private String dress = "";
    private String shoes = "";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getDress() {
        return dress;
    }

    public void setDress(String dress) {
        this.dress = dress;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    @Override
    public String toString() {
        return this.hashCode() + " " +
                this.type + "Toy{" +
                "hair='" + hair + '\'' +
                ", dress='" + dress + '\'' +
                ", shoes='" + shoes + '\'' +
                '}';
    }

}
