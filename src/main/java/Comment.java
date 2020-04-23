public class Comment implements Likable {
    private final String id;
    private final User author;
    private final Post post;
    private int likes;

    public Comment(String id, User author, Post post, int likes) {
        this.id = id;
        this.author = author;
        this.post = post;
        this.likes = likes;
    }
}
