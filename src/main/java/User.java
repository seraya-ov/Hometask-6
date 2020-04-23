import java.util.Collection;

public class User {
    private Collection<Post> posts;

    public User(Collection<Post> posts) {
        this.posts = posts;
    }
}
