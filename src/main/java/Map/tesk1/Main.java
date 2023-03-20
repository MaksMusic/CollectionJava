package Map.tesk1;
import java.util.Map;

/**
 * �������� ��������� �� ����� Java,
 * ������� ���������� ��������� Map ��� �������� ���������, ������������� ������������� ��������.
 * ��� ������� ���� ������ ���������� ������� ��� ������.
 * ������ �����, Person, ����� ��������� ���� name (��� ��������) � items (������ ���������).
 * ������ ������� ����� ����������� �������� ������� ������, Item.
 * ������ ����� ����� ��������� ���� name (�������� ��������) � count (���������� ���������).
 * ��������� Map ����� ������� ���� "��� ��������"-"������ ���������".
 * ������ ������ ��������� ����� ����� �������������� ���������� Map,
 * ���������� ���� "�������� ��������"-"���������� ���������".
 * � ����� ���������� ���������� ������������ ��������� Map � �������� ���.
 * ������ ������ �������:
 *
 */



public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Jane");

        Item item1 = new Item("Book", 5);
        Item item2 = new Item("Pen", 10);
        Item item3 = new Item("Notebook", 2);

        // ���������� ���������
        person1.addItem(item1.getName(), item1.getCount());
        person1.addItem(item2.getName(), item2.getCount());
        person2.addItem(item3.getName(), item3.getCount());

        // ����� ������ ��������� ������� ��������
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