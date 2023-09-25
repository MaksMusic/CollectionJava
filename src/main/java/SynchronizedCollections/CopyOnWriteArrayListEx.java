package SynchronizedCollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Anna1");
        list.add("Anna2");
        list.add("Anna3");
        list.add("Anna4");
        list.add("Anna5");
        System.out.println(list);
        Runnable runnable1 = ()->{
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };


        Runnable runnable2 = ()->{
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.remove(4);
                list.add("Anna6");

        };

        Thread thread = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(list);
    }
}
