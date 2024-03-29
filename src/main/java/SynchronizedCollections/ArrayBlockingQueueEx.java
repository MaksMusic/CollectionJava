package SynchronizedCollections;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.offer(6);
        System.out.println(queue);
    }
}
