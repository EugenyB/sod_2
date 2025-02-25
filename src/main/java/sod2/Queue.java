package sod2;

public interface Queue<T> {
    void enqueue(T t);
    T dequeue();
    T peek();
    boolean isEmpty();
}
