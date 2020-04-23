import java.util.Collection;

public class Post implements Likable {
    private User author;
    private int likes;
    private Collection<Comment> comments;
}
