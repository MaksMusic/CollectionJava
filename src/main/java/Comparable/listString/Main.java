package Comparable.listString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    /**
     * Задание 1: Отсортировать список строк по длине, а при одинаковой длине - лексикографически.
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Анна");
        list.add("Янн");
        list.add("Аленна");
        list.add("Дима");
        list.add("Саша");



        Comparator<String> compareByLengthThenLexicographically = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = Integer.compare(o1.length(), o2.length());
                if (result == 0) {
                    result = o1.compareTo(o2);
                }
                return result;
            }
        };

        Collections.sort(list, compareByLengthThenLexicographically);

        for (String s : list) {
            System.out.println(s);
        }

    }
}
