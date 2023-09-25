package SynchronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedList {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> arrayList = Collections.synchronizedList(list);

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }


        Runnable runnable = ()-> {
            synchronized (arrayList) {
                Iterator<Integer> iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };

        Runnable runnable2 = ()->{
            arrayList.remove(10);
        };


        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(arrayList);


    }
}
