import java.util.Collection;

public class LikeQueryHandler implements QueryHandler<LikeQuery, Collection<Like>> {
    public Collection<Like> execute(LikeQuery query) {
        return query.getLikes();
    }
}
