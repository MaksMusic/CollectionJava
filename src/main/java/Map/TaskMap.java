package Map;

import java.util.*;

public class TaskMap {
    public static void main(String[] args) {
    }


    /**
     * �����1��� Map, ���������� ���������� � ���������� ������� ����������� ����� � �������� ������
     */
    public Map<String, Integer> countWords(String text) {
        String[] words = text.split("\\W+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }




    /**
     * 2 �������� �����, ������� ��������� �� ���� Map, ���������� ���������� � ����������
     * ���������� ���� � ������, � ������� ���-10 ����� ����� ������������� ����.
     */

    public void printTop10Words(Map<String, Integer> wordCount) {
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(wordCount.entrySet());
        Comparator<Map.Entry<String, Integer>> comparatop = new Comparator<>() {

            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        };

        Collections.sort(list,comparatop);

        for (int i = 0; i < 10 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());
        }
    }





    /**
     *   3  �������� Map, ���������� ���������� � ���������� ���������, ����������� � ������ ����� �� ����������.
     */
    public Map<Integer, Integer> countStudentsByCourse(List<Student> students) {
        Map<Integer, Integer> courseCount = new HashMap<>();
        for (Student student : students) {
            int course = student.getCourse();
            if (courseCount.containsKey(course)) {
                courseCount.put(course, courseCount.get(course) + 1);
            } else {
                courseCount.put(course, 1);
            }
        }
        return courseCount;
    }







}
