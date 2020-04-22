public class PostQueryHandler implements QueryHandler<PostQuery, Post> {
    public Post execute(PostQuery query) {
        return query.getPost();
    }
}
