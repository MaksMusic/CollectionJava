package classCollections;

import java.util.*;

public class CollectionsTask {
    public static void main(String[] args) {

        /** Создать список чисел и отсортировать его по возрастанию с помощью метода Collections.sort() */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-5);
        numbers.add(7);
        Collections.sort(numbers);
        System.out.println(numbers); // [-5, 7, 10]

        /**	Создать множество строк и найти в нем максимальный элемент (в алфавитном порядке) с помощью метода Collections.max()*/

        Set<String> words = new HashSet<>();
        words.add("apple");
        words.add("zebra");
        words.add("cat");
        String max = Collections.max(words);
        System.out.println(max); // zebra

        /** Написать программу, которая найдет максимальный и минимальный элементы в списке чисел с помощью методов max()
         * и min() класса Collections. */

        List<Integer> numbers2 = new ArrayList<>();
        numbers.add(10);
        numbers.add(-5);
        numbers.add(7);
        int max2 = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.printf("Max: %d, Min: %d", max2, min); // Max: 10, Min: -5
        System.out.println();


        /**  4.	Создать очередь строк и добавить в нее несколько элементов с помощью метода Collections.addAll(). Затем удалить первый элемент с помощью метода remove(). */

        Queue<String> queue = new LinkedList<>();
        Collections.addAll(queue, "one", "two", "three");
        queue.remove();



        /** 5.Создать список объектов и перетасовать его с помощью метода Collections.shuffle().  */

        List<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add("hello");
        objects.add(true);
        Collections.shuffle(objects);
        System.out.println(objects); // [true, hello, 1] (порядок случайный)



    /** 6. Перевернуть список строк в обратном порядке с помощью метода Collections.reverse().  */

        List<String> words1 = new ArrayList<>();
        words1.add("apple");
        words1.add("banana");
        words1.add("cherry");
        System.out.println("Before: " + words1); // Before: [apple, banana, cherry]
        Collections.reverse(words1);
        System.out.println("After: " + words1); // After: [cherry, banana, apple]




        /** 7 Отсортировать список целых чисел по возрастанию и выполнить поиск определенного числа с
         *  помощью метода Collections.binarySearch(). */

        List<Integer>  numbers1 = new ArrayList<>();
         numbers1.add(10);
         numbers1.add(-5);
         numbers1.add(7);
         numbers1.add(2);
        System.out.println("Before sort: " +  numbers1); // Before sort: [10, -5, 7, 2]
        Collections.sort( numbers1);
        System.out.println("After sort: " +  numbers1); // After sort: [-5, 2, 7, 10]
        int key = 7;
        int index = Collections.binarySearch( numbers1, key);
        System.out.printf("Index of %d: %d", key, index); // Index of 7: 2




        /** 9  Скопировать список объектов в другой список с помощью метода Collections.copy(). */
        List<String> source = new ArrayList<>();
        source.add("apple");
        source.add("banana");
        source.add("cherry");
        List<String> target = new ArrayList<>(Collections.nCopies(source.size(), ""));
        Collections.copy(target, source);
        System.out.println("Source: " + source); // Source: [apple, banana, cherry]
        System.out.println("Target: " + target); // Target: [apple, banana, cherry]


        /** 10 Посчитать, сколько раз объект встречается в коллекции с помощью метода Collections.frequency(). */

        List<String> world11 = new ArrayList<>();
        world11.add("apple");
        world11.add("apple");
        world11.add("banana");
        world11.add("cherry");
        world11.add("apple");
        String key11 = "apple";
        int count = Collections.frequency(world11, key);
        System.out.printf("%s occurs %d times", key11, count); // apple occurs 3 times



        /** 11 Получить синхронизированную (потокобезопасную) коллекцию
         * с помощью метода Collections.synchronizedCollection(). */
        List<String> worlds17 = new ArrayList<>();
        worlds17.add("apple");
        worlds17.add("banana");
        worlds17.add("cherry");
        Collection<String> syncWords = Collections.synchronizedCollection(worlds17);
        System.out.println(syncWords); // [apple, banana, cherry]


        /** создаем массив из списка с помощью метода toArray() */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Integer[] array = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(array));
        // Теперь переменная array содержит массив элементов списка list.


        /**сделать из массиа  лист и вывести его в обратном порядке */
        String[] arr = {"one", "two", "three", "four", "five"};

        List<String> list11 = Arrays.asList(arr); //получить лист из массива (не изменяемый)

        arr = list11.toArray(new String[list.size()]); //получить массив из листа

        System.out.println(Arrays.toString(arr));
        System.out.println(list11);

        //получить изменяемый массив из лисита и добавить туда элемент
        List<String> list1 = new ArrayList(Collections.nCopies(arr.length,null));
        Collections.copy(list1,list11);
        list1.add(0,"null");
        Collections.reverse(list11); //перевернуть лист
        System.out.println(list1);


    }



}
