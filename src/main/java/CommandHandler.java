public interface CommandHandler<TCommand extends Command> {
    //Handle command (like/comment/post)
    void execute(TCommand command);
}
