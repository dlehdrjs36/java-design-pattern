package composite;

public class Main {
    public static void main(String[] args) {
        Graphic line = new Line();
        Graphic text = new Text();
        Graphic rectangle = new Rectangle();
        Graphic parentPicture = new Picture();
        Graphic childPicture = new Picture();

        /* Leaf 클래스는 자식과 관련된 연산 미동작 */
        line.draw();
        line.add(text);
        System.out.println(line.getChild(0));
        line.remove(text);
        System.out.println("-----------------------");
        text.draw();
        text.add(line);
        System.out.println(text.getChild(0));
        text.remove(line);
        System.out.println("-----------------------");
        rectangle.draw();
        rectangle.add(text);
        System.out.println(rectangle.getChild(0));
        rectangle.remove(text);
        System.out.println("-----------------------");
        /* //Leaf 클래스는 자식과 관련된 연산 미동작 */

        /* 복합 구성요소는 자식과 관련된 연산 동작 */
        childPicture.add(line);
        childPicture.add(text);
        childPicture.add(rectangle);
        childPicture.draw();
        childPicture.remove(line);
        System.out.println(childPicture.getChild(0));
        childPicture.draw();
        System.out.println("-----------------------");
        parentPicture.add(new Text());
        parentPicture.add(new Text());
        parentPicture.add(new Text());
        parentPicture.add(childPicture);
        parentPicture.add(new Rectangle());
        parentPicture.draw();
        System.out.println("-----------------------");
        System.out.println(parentPicture.getChild(0));
        System.out.println(parentPicture.getChild(1));
        System.out.println(parentPicture.getChild(2));
        parentPicture.remove(parentPicture.getChild(0));
        System.out.println("-----------------------");
        parentPicture.draw();
        System.out.println("-----------------------");
        System.out.println(parentPicture.getChild(0));
        System.out.println(parentPicture.getChild(1));
        System.out.println(parentPicture.getChild(2));
        /* //복합 구성요소는 자식과 관련된 연산 동작 */
    }
}
