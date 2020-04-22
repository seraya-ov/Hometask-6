import java.util.Collection;

public class CommentQueryHandler implements QueryHandler<CommentQuery, Collection<Comment>> {
    public Collection<Comment> execute(CommentQuery query) {
        return query.getComments();
    }
}
