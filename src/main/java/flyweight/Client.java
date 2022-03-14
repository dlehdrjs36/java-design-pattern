package flyweight;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('f', "black", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('l', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('y', "red", fontFactory.getFont("nanum:12"));
        Character c4 = new Character('w', "yellow", fontFactory.getFont("nanum:12"));
        Character c5 = new Character('e', "white", fontFactory.getFont("nanum:12"));
        Character c6 = new Character('i', "green", fontFactory.getFont("nanum:12"));
        Character c7 = new Character('g', "white", fontFactory.getFont("nanum:12"));
        Character c8 = new Character('h', "red", fontFactory.getFont("nanum:12"));
        Character c9 = new Character('t', "black", fontFactory.getFont("nanum:12"));
    }
}
