import java.util.Collection;

public class Post implements Likable {
    private final String id;
    private final User author;
    private int likes;
    private Collection<Comment> comments;

    public Post(String id, User author, int likes, Collection<Comment> comments) {
        this.id = id;
        this.author = author;
        this.likes = likes;
        this.comments = comments;
    }
}
