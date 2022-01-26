package prototype;

public class Main {

    public static void main(String[] args) {
        ItemVendingMachine itemVendingMachine = new ItemVendingMachine();
        itemVendingMachine.setItem(new Apple());
        itemVendingMachine.setItem(new Sword());
        itemVendingMachine.setItem(new ManaPotion());
        itemVendingMachine.setItem(new HealthPotion());

        //아이템을 뽑을 때 마다 원형에 자신의 복제를 요청하여 새로운 객체 생성
        for (int i = 0; i < 10; i++) {
            Item item = itemVendingMachine.getItem();
            item.use();
        }

        System.out.println("--------------------------");
        itemVendingMachine.deleteItem(new Apple()); //원형 관리자에서 Apple 원형 제거
        itemVendingMachine.deleteItem(new Sword()); //원형 관리자에서 Apple 원형 제거
        itemVendingMachine.deleteItem(new HealthPotion()); //원형 관리자에서 Apple 원형 제거
        System.out.println("--------------------------");

        for (int i = 0; i < 5; i++) {
            Item item = itemVendingMachine.getItem();
            item.use();
        }
    }
}
