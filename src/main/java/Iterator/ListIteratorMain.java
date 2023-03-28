package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMain {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");

        // Получаем итератор для List
        ListIterator<String> iterator = list.listIterator();

         //Выводим элементы списка вперед
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Выводим элементы списка назад

        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.println(element);
        }
    }





}
