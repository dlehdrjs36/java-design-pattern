package iterator.after;

import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("포스트1");
        board.addPost("포스트2");
        board.addPost("포스트3");

        //가장 최신 글 먼저 순회하기
        Iterator<Post> postIterator = board.iterator();
        while (postIterator.hasNext()) {
            Post post = postIterator.next();
            System.out.println(post.getTitle());
        }
    }
}
