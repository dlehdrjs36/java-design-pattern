package flyweight;

//값과 글의 색상은 변하지않는 본질적인 속성이 아니라 자주 변하는 속성이라 본다.
public class Character {
    private char value;

    private String color;

    //Flyweight 객체 참조
    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
