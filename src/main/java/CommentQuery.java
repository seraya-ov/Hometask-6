import java.util.Collection;

public class CommentQuery implements Query {
    private Collection<Comment> comments;

    public Collection<Comment> getComments() {
        return comments;
    }
}
