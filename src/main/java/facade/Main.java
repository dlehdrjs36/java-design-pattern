package facade;

public class Main {
    public static void main(String[] args) {
        //의류 건조기를 실행시키면 의류 건조기는 내부의 시스템을 적절하게 동작시킨다.
        ClothesDryer clothesDryer = new ClothesDryer();
        clothesDryer.start();
    }
}
