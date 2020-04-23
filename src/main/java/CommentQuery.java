import java.util.Collection;

public class CommentQuery implements Query {
    private Collection<Comment> comments;

    public CommentQuery(Collection<Comment> comments) {
        this.comments = comments;
    }

    public Collection<Comment> getComments() {
        return comments;
    }
}
