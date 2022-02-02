package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Composite
public class Picture extends Graphic {
    private final List<Graphic> graphicList;

    public Picture() {
        graphicList = new ArrayList<>();
    }

    @Override
    public void draw() {
        System.out.println("composite draw start");
        for (int i = 0; i < this.graphicList.size(); i++) {
            this.graphicList.get(i).draw();
        }
        System.out.println("composite draw end");
    }

    @Override
    public Graphic getChild(int i) {
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
