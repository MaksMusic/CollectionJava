package Set;

import java.util.*;

public class TaskSet {
    public static void main(String[] args) {
        /** 1 �������� HashSet, �������� ��������� ��������� � �������� �� ����� ���������� ���������.*/


        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");

        for (String s : set) {
            System.out.println(s);
        }


        /** 2  �������� TreeSet, �������� ��������� ��������� � �������� �� ����� ���������� ��������� � ��������������� �������*/

        Set<String> set2 = new TreeSet<>();
        set2.add("apple");
        set2.add("banana");
        set2.add("orange");

        for (String s : set2) {
            System.out.println(s);
        }


        /**
         *
         3 �������� LinkedHashSet, �������� ��������� ��������� � �������� �� ����� ���������� ���������
         � ������� ���������� ���������.
         */

        Set<String> set3 = new LinkedHashSet<>();
        set3.add("apple");
        set3.add("banana");
        set3.add("orange");

        for (String s : set3) {
            System.out.println(s);
        }


        /** 4 ������� ��� �������� �� ��������� */


        Set<String> set4 = new HashSet<>();
        set4.add("apple");
        set4.add("banana");
        set4.add("orange");

        set4.clear();


        /** 5 ���������, �������� �� ��������� ������������ �������*/

        Set<String> set5 = new HashSet<>();
        set5.add("apple");
        set5.add("banana");
        set5.add("orange");

        if (set5.contains("banana")) {
            System.out.println("The set contains 'banana'");
        }


        /** 6 ������� ����������� ���� �������� */

        HashSet<Integer> set6 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // �����������
        Set<Integer> intersection = new HashSet<>(set6);
        intersection.retainAll(set6);
        System.out.println("�����������: " + intersection);


        /** 7 ������� ����������� ���� �������� */

        Set<Integer> set7 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set8 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // �����������
        Set<Integer> union = new HashSet<>(set7);
        union.addAll(set8);
        System.out.println("�����������: " + union);



        /**8 ������� �������� ���� �������� */

        Set<Integer> set9 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set10 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // ��������
        Set<Integer> difference = new HashSet<>(set9);
        difference.removeAll(set10);
        System.out.println("��������: " + difference);



        /** 9 ���������, �������� �� ���� ��������� ������������� ������� ���������*/
        Set<Integer> set11 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set12 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        // �������� ������������
        boolean isSubset = set11.containsAll(set12);
        System.out.println("set2 �������� ������������� set1: " + isSubset);



        /** �������� ��� �������� ��������� ��������� � �������� �� ����� ������ ������� */

        Set<Integer> set13 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = set13.iterator();

        // �������� �� ���������
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }





    }
}
