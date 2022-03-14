package flyweight;

//플라이급 객체는 불변성을 가져야한다. 변경되면 모든 것에 영향을 준다.
//여기서는 family와 size를 본질적인 속성으로 보았고 그것을 하나로 묶었다.
//Flyweight
public final class Font {

    private final String family;

    private final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
