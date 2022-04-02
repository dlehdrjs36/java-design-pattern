package mediator.after;

//Colleague
public class Guest {
    private Integer id;

    private String roomNumber;

    private final FrontDesk frontDesk;

    public Guest() {
        this.frontDesk = new DefaultFrontDesk();
    }

    public Guest(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void getTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
