public interface QueryDispatcher {
    //calling the right query handler
    //No implementations yet because we have only one handler for each query
    <TResult> TResult execute(Query query);
}
