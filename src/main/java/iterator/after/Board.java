package iterator.after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Aggregate
public class Board {

    private List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> iterator() {
        return new RecentPostIterator(this.getPosts());
    }
}
