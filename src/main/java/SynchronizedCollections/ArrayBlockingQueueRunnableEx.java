package SynchronizedCollections;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueRunnableEx  {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue =
                new ArrayBlockingQueue<>(5);

        //Producer
        new Thread(()->{
            int i = 0;
            while (true){
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Producer add number " + i);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //Consumer
        new Thread(()->{
            while (true){
                Integer j = null;
                try {
                    j = arrayBlockingQueue.take();
                    System.out.println("Consumer zabral " +j);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}


