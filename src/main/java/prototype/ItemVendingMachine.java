package prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemVendingMachine {
    private final List<Item> itemList;//원형 관리자(원형에 대한 정보를 검색하거나 저장 또는 삭제하는 기능을 담당)

    public ItemVendingMachine() {
        itemList = new ArrayList<>();
    }

    //아이템 등록(원형 등록)
    public void setItem(Item item) {
        itemList.add(item);
    }

    //아이템 삭제(원형 삭제)
    public void deleteItem(Item deleteItem) {
        for (int index = 0; index < itemList.size(); index++) {
            Item item = itemList.get(index);
            if(item.getClass().equals(deleteItem.getClass())) {
                Item removeItem = itemList.remove(index);
                System.out.println("remove Item : " + removeItem);
            }
        }
    }

    //아이템 뽑기
    public Item getItem() {//Operation()
        Random rn = new Random();
        Item item = itemList.get(rn.nextInt(itemList.size()));

        try {
            return item.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }
}
