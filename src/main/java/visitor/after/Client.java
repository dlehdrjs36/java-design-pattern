package visitor.after;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        /*
            메서드 오버로딩은 런타임에 해당 타입이 존재하지 않을 가능성이 있기 떄문에 컴파일 타임에 구체적인 타입으로 매핑이 되어야 한다.
            이러한 이유로 상위 타입이라고 할지라도 인자로 사용할 수 없어 컴파일 에러가 발생한다.
            예) Device phone = new Phone(); X
            Shape의 오버로딩을 Device로 이동 시키고 더블 디스패치를 이용해서 해결한다.

            더블 디스패치
            - 구체적인 타입을 찾아가는 디스패치가 2번 일어난다.
            - accept가 어느 클래스의 accept 인지 찾는 것
            - accept 내부에서 호출되는 함수가 어느 클래스의 print 인지 찾는 것

        */
        Device device = new Phone();
        rectangle.accept(device);
    }
}
