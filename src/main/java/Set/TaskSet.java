package Set;

import java.util.*;

public class TaskSet {
    public static void main(String[] args) {
        /** 1 Создайте HashSet, добавьте несколько элементов и выведите на экран содержимое множества.*/


        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");

        for (String s : set) {
            System.out.println(s);
        }


        /** 2  Создайте TreeSet, добавьте несколько элементов и выведите на экран содержимое множества в отсортированном порядке*/

        Set<String> set2 = new TreeSet<>();
        set2.add("apple");
        set2.add("banana");
        set2.add("orange");

        for (String s : set2) {
            System.out.println(s);
        }


        /**
         *
         3 Создайте LinkedHashSet, добавьте несколько элементов и выведите на экран содержимое множества
         в порядке добавления элементов.
         */

        Set<String> set3 = new LinkedHashSet<>();
        set3.add("apple");
        set3.add("banana");
        set3.add("orange");

        for (String s : set3) {
            System.out.println(s);
        }


        /** 4 Удалите все элементы из множества */


        Set<String> set4 = new HashSet<>();
        set4.add("apple");
        set4.add("banana");
        set4.add("orange");

        set4.clear();


        /** 5 Проверьте, содержит ли множество определенный элемент*/

        Set<String> set5 = new HashSet<>();
        set5.add("apple");
        set5.add("banana");
        set5.add("orange");

        if (set5.contains("banana")) {
            System.out.println("The set contains 'banana'");
        }


        /** 6 Найдите пересечение двух множеств */

        HashSet<Integer> set6 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // Пересечение
        Set<Integer> intersection = new HashSet<>(set6);
        intersection.retainAll(set6);
        System.out.println("Пересечение: " + intersection);


        /** 7 Найдите объединение двух множеств */

        Set<Integer> set7 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set8 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // Объединение
        Set<Integer> union = new HashSet<>(set7);
        union.addAll(set8);
        System.out.println("Объединение: " + union);



        /**8 Найдите разность двух множеств */

        Set<Integer> set9 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set10 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // Разность
        Set<Integer> difference = new HashSet<>(set9);
        difference.removeAll(set10);
        System.out.println("Разность: " + difference);



        /** 9 Проверьте, является ли одно множество подмножеством другого множества*/
        Set<Integer> set11 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set12 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // Проверка подмножества
        boolean isSubset = set11.containsAll(set12);
        System.out.println("set2 является подмножеством set1: " + isSubset);



        /** Итератор для перебора элементов множества и выведите на экран каждый элемент */

        Set<Integer> set13 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = set13.iterator();

        // Итерация по множеству
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }





    }
}
