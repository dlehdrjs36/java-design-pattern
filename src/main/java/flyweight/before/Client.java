package flyweight.before;

public class Client {
    public static void main(String[] args) {
        Character c1 = new Character('f', "black", "nanum", 12);
        Character c2 = new Character('l', "white", "nanum", 12);
        Character c3 = new Character('y', "red", "nanum", 12);
        Character c4 = new Character('w', "yellow", "nanum", 12);
        Character c5 = new Character('e', "white", "nanum", 12);
        Character c6 = new Character('i', "green", "nanum", 12);
        Character c7 = new Character('g', "white", "nanum", 12);
        Character c8 = new Character('h', "red", "nanum", 12);
        Character c9 = new Character('t', "black", "nanum", 12);
    }
}
