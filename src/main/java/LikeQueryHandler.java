public class LikeQueryHandler implements QueryHandler<LikeQuery, Integer> {
    public Integer execute(LikeQuery query) {
        return query.getLikes();
    }
}
