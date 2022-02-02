package composite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Picture extends Graphic {
    private final List<Graphic> graphicList;

    public Picture() {
        graphicList = new ArrayList<>();
    }

    @Override
    public void draw() {
        System.out.println("composite draw start");
        for (Graphic graphic : this.graphicList) {
            graphic.draw();
        }
        System.out.println("composite draw end");
    }

    @Override
    public Graphic getChild(int i) {
        if(this.graphicList.size() == 0){
            throw new IndexOutOfBoundsException("Composite에서 자식을 삭제하면 자식은 Composite의 부모를 가리키는 참조자에서 삭제된다.");
        }
        return this.graphicList.get(i);
    }

    @Override
    public void add(Graphic graphic) {
        this.graphicList.add(graphic);
    }

    @Override
    public void remove(Graphic graphic) {
        System.out.println("remove " + this.graphicList.remove(graphic));
    }
}
