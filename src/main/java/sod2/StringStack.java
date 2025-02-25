package sod2;

public class StringStack implements Stack<String> {

    private String[] data = new String[1000];
    private int size = 0;

    @Override
    public void push(String v) {
        data[size++] = v;
    }

    @Override
    public String pop() {
        return data[--size];
    }

    @Override
    public String peek() {
        return data[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
