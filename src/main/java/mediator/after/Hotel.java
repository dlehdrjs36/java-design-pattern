package mediator.after;


public class Hotel {
    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.setId(1);
        guest.setRoomNumber("100");
        guest.getTowers(3);

        Guest guest2 = new Guest();
        guest2.setId(5);
        guest2.setRoomNumber("2030");
        guest2.getTowers(5);
    }
}