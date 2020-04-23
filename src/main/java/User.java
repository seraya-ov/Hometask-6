import java.util.Collection;

public class User {
    private final String id;
    private Collection<Post> posts;

    public User(String id, Collection<Post> posts) {
        this.id = id;
        this.posts = posts;
    }
}
