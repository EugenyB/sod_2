package sod2;

public interface Stack<T> {
    void push(T o);
    T pop();
    T peek();
    boolean isEmpty();
}
