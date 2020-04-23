public class LikeCommand implements Command {
    private Likable likable;

    public LikeCommand(Likable likable) {
        this.likable = likable;
    }
}
