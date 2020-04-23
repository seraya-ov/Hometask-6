import java.util.Collection;

public class Post implements Likable {
    private final User author;
    private int likes;
    private Collection<Comment> comments;

    public Post(User author, int likes, Collection<Comment> comments) {
        this.author = author;
        this.likes = likes;
        this.comments = comments;
    }
}
