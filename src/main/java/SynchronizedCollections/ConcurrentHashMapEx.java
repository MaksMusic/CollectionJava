package SynchronizedCollections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap();
        map.put(1,"Anna1");
        map.put(2,"Anna2");
        map.put(3,"Anna3");
        map.put(4,"Anna4");
        map.put(5,"Anna5");


        Runnable runnable1 = ()->{
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + ":"+ map.get(i));

            }
        };


        Runnable runnable2 = ()->{
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            map.put(6,"Anna6");

        };
        Thread thread = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(map);



    }
}
