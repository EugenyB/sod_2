package sod2;

public class StackOnList<T> implements Stack<T> {

    Item top = null;

    @Override
    public void push(T v) {
        top = new Item(v, top);
    }

    @Override
    public T pop() {
        T value = top.getData();
        top = top.getNext();
        return value;
    }

    @Override
    public T peek() {
        return top.getData();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    class Item {
        private T data;
        private Item next;

        public Item(T data, Item next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Item getNext() {
            return next;
        }
    }
}
