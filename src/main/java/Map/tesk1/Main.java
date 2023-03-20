package Map.tesk1;
import java.util.Map;

/**
 * Напишите программу на языке Java,
 * которая использует коллекцию Map для хранения предметов, принадлежащих определенному человеку.
 * Для решения этой задачи необходимо создать два класса.
 * Первый класс, Person, будет содержать поля name (имя человека) и items (список предметов).
 * Каждый предмет будет описываться объектом второго класса, Item.
 * Второй класс будет содержать поля name (название предмета) и count (количество предметов).
 * Коллекция Map будет хранить пары "имя человека"-"список предметов".
 * Каждый список предметов будет также представляться коллекцией Map,
 * содержащей пары "название предмета"-"количество предметов".
 * В вашей реализации необходимо использовать коллекцию Map и принципы ООП.
 * Пример вызова методов:
 *
 */



public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Jane");

        Item item1 = new Item("Book", 5);
        Item item2 = new Item("Pen", 10);
        Item item3 = new Item("Notebook", 2);

        // добавление предметов
        person1.addItem(item1.getName(), item1.getCount());
        person1.addItem(item2.getName(), item2.getCount());
        person2.addItem(item3.getName(), item3.getCount());

        // вывод списка предметов каждого человека
        System.out.println(person1.getName() + "'s items:");
        Map<String, Integer> person1Items = person1.getItems();
        for (String itemName : person1Items.keySet()) {
            int itemCount = person1Items.get(itemName);
            System.out.println(itemName + ": " + itemCount);
        }

        System.out.println();

        System.out.println(person2.getName() + "'s items:");
        Map<String, Integer> person2Items = person2.getItems();
        for (String itemName : person2Items.keySet()) {
            int itemCount = person2Items.get(itemName);
            System.out.println(itemName + ": " + itemCount);
        }
    }
}