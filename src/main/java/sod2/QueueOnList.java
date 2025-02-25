package sod2;

public class QueueOnList<T> implements Queue<T> {

    private Item front = null;
    private Item back = null;

    @Override
    public void enqueue(T t) {
        Item item = new Item(t);
        if (front == null) {
            front = item;
        } else {
            back.setNext(item);
        }
        back = item;
    }

    @Override
    public T dequeue() {
        var value = front.getData();
        front = front.getNext();
        return value;
    }

    @Override
    public T peek() {
        return front.getData();
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    class Item {
        private T data;
        private Item next;

        public Item(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Item getNext() {
            return next;
        }

        public void setNext(Item next) {
            this.next = next;
        }
    }
}
