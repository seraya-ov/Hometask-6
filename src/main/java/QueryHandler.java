public interface QueryHandler<TQuery extends Query, TResult> {
    //Handle query (comments/likes/posts)
    TResult execute(TQuery query);
}
