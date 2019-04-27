package algorithms;

public interface Algorithm<R, P> {

    String question();
    R solution(P params);

}
