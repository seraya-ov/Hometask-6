public class LikeQuery implements Query {
    private int likes;

    public LikeQuery(int likes) {
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }
}
