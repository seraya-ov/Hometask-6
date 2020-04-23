public class Comment implements Likable {
    private User author;
    private int likes;

    public Comment(User author, int likes) {
        this.author = author;
        this.likes = likes;
    }
}
