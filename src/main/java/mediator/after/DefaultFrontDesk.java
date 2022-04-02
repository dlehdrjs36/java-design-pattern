package mediator.after;

//ConcreteMediator
public class DefaultFrontDesk implements FrontDesk{

    private final CleaningService cleaningService = new CleaningService(this);

    private Guest guest;

    public void getTowers(Guest guest, int numberOfTowers) {
        this.guest = guest;
        //컴포넌트 간의 결합도를 낮추기 위해서 중재자를 이용한다.
        //연관되어 있는 컴포넌트에 누구한테 응답을 줘야하는지 구체적으로 알려준다면 다시 컴포넌트 간의 결합이 생겨서 보내면 안된다.
        //따라서 요청을 처리하는데 필요한 만큼의 정보만 전달한다. 호텔 서비스를 제공하기 위해서는 회원의 아이디를 알면 된다.
        this.cleaningService.getTowers(guest.getId(), numberOfTowers); //회원의 방에 타월을 가져다준다.
    }

    public String getRoomNumberFor() {
        return guest.getRoomNumber();
    }
}
