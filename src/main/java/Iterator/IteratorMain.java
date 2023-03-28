package Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorMain {
    public static void main(String[] args) {
        // Создаем экземпляр класса ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // Добавляем элементы в список
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");

        // Получаем объект итератора для ArrayList
        Iterator<String> iterator = list.iterator();

        // Перебираем элементы списка ArrayList с помощью итератора
        while (iterator.hasNext()) {
            System.out.println(iterator.next());//  Получаем следующий элемент и выводим его на экран
            iterator.remove();
        }
        System.out.println(list);


    }

    public static void setIterator() {
        // Создаем экземпляр класса HashSet
        Set<String> set = new HashSet<String>();

        // Добавляем элементы в коллекцию Set
        set.add("Первый");
        set.add("Второй");
        set.add("Третий");

        // Получаем объект итератора для Set
        Iterator<String> iterator = set.iterator();

        // Перебираем элементы коллекции Set с помощью итератора
        while (iterator.hasNext()) {
            // Получаем следующий элемент
            String element = iterator.next();
            // Выводим его на экран
            System.out.println(element);
        }
    }


}


