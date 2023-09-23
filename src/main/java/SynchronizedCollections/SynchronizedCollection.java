package SynchronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollection {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        //ArrayList<Integer> target = new ArrayList<>();
        List<Integer> target =
                Collections.synchronizedList(new ArrayList<>());
        Runnable runnable = ()->{target.addAll(list);};
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(target);

    }
}
