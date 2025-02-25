package sod2;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
//        var stack = new StackOnList<String>();
//        stack.push("Hello");
//        stack.push("World");
//        stack.push("Java");
//        stack.push("Sod2");
//
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

//        var queue = new QueueOnList<String>();
//        queue.enqueue("a");
//        queue.enqueue("b");
//        queue.enqueue("c");
//        queue.enqueue("d");
//        queue.enqueue("e");
//        queue.enqueue("f");
//        queue.enqueue("g");
//
//        while (!queue.isEmpty()) {
//            System.out.print(queue.dequeue()+" ");
//        }

        var queue = new PriorityQueue<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(5);
        queue.add(9);
        queue.add(4);
        queue.add(7);
        queue.add(8);
        queue.add(6);

        System.out.println(queue);

        while (!queue.isEmpty()) {
            var item = queue.poll();
            System.out.print(item + " ");
        }
    }

}
