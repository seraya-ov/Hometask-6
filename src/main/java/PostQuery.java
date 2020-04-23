public class PostQuery implements Query {
    private Post post;

    public PostQuery(Post post) {
        this.post = post;
    }

    public Post getPost() {
        return post;
    }
}
