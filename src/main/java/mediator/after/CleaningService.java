package mediator.after;

//Colleague
public class CleaningService {

    //회원 아이디에 해당하는 방에 서비스를 제공할 수 있다.
    private final FrontDesk frontDesk;

    public CleaningService(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void getTowers(Integer guestId, int numberOfTowers) {
        String roomNumber = this.frontDesk.getRoomNumberFor();
        System.out.println("provide " + numberOfTowers + " towers to room " + roomNumber);
    }
}
