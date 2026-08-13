package DataStructures.Queue;

import java.util.Deque;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class InbuiltQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // System.out.println(queue.peek());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());
        // System.out.println(queue.poll());

        // System.out.println(queue.remove());

        Deque<Integer> dQueue = new ArrayDeque<>();

        dQueue.addFirst(9);
        dQueue.add(75);
        dQueue.addLast(80);

        dQueue.removeFirst();

    }
}