public interface CommandDispatcher {
    //calling the right command handler
    //No implementations yet because we have only one handler for each command
    void execute(Command command);
}