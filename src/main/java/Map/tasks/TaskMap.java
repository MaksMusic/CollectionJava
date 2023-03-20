package Map.tasks;

import java.time.LocalDateTime;
import java.util.*;

public class TaskMap {
    public static void main1(String[] args) {
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

        Collections.sort(list, comparatop);

        for (int i = 0; i < 10 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());
        }
    }


    /**
     * 3  �������� Map, ���������� ���������� � ���������� ���������, ����������� � ������ ����� �� ����������.
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


    /**
     * 4 �������� �����, ������� ��������� �� ���� Map � �������� ��������� �
     * ���������� ������ ���������, � ������� ������� ���� ���� 4.
     */

    //��� stream
    public List<Student> getStudentsWithAverageGradeAbove4NoStream(Map<Student, List<Integer>> grades) {
        List<Student> goodStudents = new ArrayList<>();
        for (Map.Entry<Student, List<Integer>> entry : grades.entrySet()) {
            List<Integer> studentGrades = entry.getValue();
            int sum = 0;
            for (Integer grade : studentGrades) {
                sum += grade;
            }
            double averageGrade = (double) sum / studentGrades.size();
            if (averageGrade > 4) {
                goodStudents.add(entry.getKey());
            }
        }
        return goodStudents;
    }


    //Stream
    public List<Student> getStudentsWithAverageGradeAbove4(Map<Student, List<Integer>> grades) {
        List<Student> goodStudents = new ArrayList<>();
        for (Map.Entry<Student, List<Integer>> entry : grades.entrySet()) {
            double averageGrade = entry.getValue().stream().mapToInt(Integer::intValue).average().orElse(0);
            if (averageGrade > 4) {
                goodStudents.add(entry.getKey());
            }
        }
        return goodStudents;
    }


    /**
     * 5 �������� Map, ���������� ���������� � ���������� ������� �� ������ ������� ����
     */

    public void ProductsByType() {
        Map<String, Integer> warehouse = new HashMap<>();
        warehouse.put("Product 1", 20);
        warehouse.put("Product 2", 15);
        warehouse.put("Product 3", 30);
    }


    /**
     * 6. �������� �����, ������� ��������� �� ���� Map � ������ ������� � ����������
     * ������ �������, ��������� ������� �� ��������� ��������.
     */

    public List<String> getProductsBelowPrice(Map<String, Double> prices, double maxPrice) {
        List<String> affordableProducts = new ArrayList<>();
        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            if (entry.getValue() <= maxPrice) {
                affordableProducts.add(entry.getKey());
            }
        }
        return affordableProducts;
    }


    /**
     * 7  �������� Map, ���������� ���������� � ���������� ������� � ��������-�������� �� ������� ������
     */


    public Map<String, Integer> countOrdersByMonth(List<Order> orders) {
        Map<String, Integer> orderCount = new HashMap<>();
        for (Order order : orders) {
            String month = order.getDate().substring(0, 7);
            if (orderCount.containsKey(month)) {
                orderCount.put(month, orderCount.get(month) + 1);
            } else {
                orderCount.put(month, 1);
            }
        }
        return orderCount;
    }






    /**
     8 �������� �����, ������� ��������� �� ���� Map � ����������� � ������� � ����������
     ����� ����� ������� �� �������� ������ �������.
     */


    public double getTotalOrderAmount(Map<Order, Double> orderAmounts, String startDate, String endDate) {
        double totalAmount = 0;
        for (Map.Entry<Order, Double> entry : orderAmounts.entrySet()) {
            String orderDate = entry.getKey().getDate();
            if (orderDate.compareTo(startDate) >= 0 && orderDate.compareTo(endDate) <= 0) {
                totalAmount += entry.getValue();
            }
        }
        return totalAmount;
    }

    /** 9 �������� Map, ���������� ���������� � ���������� ��������� ������ �������� �� ����� */

    public static void main2(String[] args) {
        List<Visit> visits = new ArrayList<>();
        visits.add(new Visit("homepage", LocalDateTime.now()));
        visits.add(new Visit("blog", LocalDateTime.now()));
        visits.add(new Visit("homepage", LocalDateTime.now()));
        visits.add(new Visit("product", LocalDateTime.now()));
        visits.add(new Visit("blog", LocalDateTime.now()));
        Map<String, Integer> pageVisits = countPageVisits(visits);
        System.out.println(pageVisits);
    }

    public static Map<String, Integer> countPageVisits(List<Visit> visits) {
        Map<String, Integer> pageVisits = new HashMap<>();
        for (Visit visit : visits) {
            String page = visit.getPage();
            if (pageVisits.containsKey(page)) {
                pageVisits.put(page, pageVisits.get(page) + 1);
            } else {
                pageVisits.put(page, 1);
            }
        }
        return pageVisits;
    }


    /** 10 �������� �����, ������� ��������� �� ���� Map � ����������� � ���������� �����
        � ���������� ������ �������, ������� ���� �������� ����� 100 ���.
     */

    public static void main(String[] args) {
        // ������� ����� ���������� ��������� ������ �������� �� �����
        Map<String, Integer> pageVisits = new HashMap<>();
        pageVisits.put("homepage", 125);
        pageVisits.put("about", 76);
        pageVisits.put("blog", 234);
        pageVisits.put("product", 42);
        pageVisits.put("contact", 98);

        // �������� ������ ���������� ������� (����� 100 ���������)
        List<String> popularPages = getPopularPages(pageVisits);

        // ������� ������ ���������� ������� �� �����
        System.out.println("����� ���������� �������� �����:");
        for (String page : popularPages) {
            System.out.println("- " + page);
        }
    }

    public  static List<String> getPopularPages(Map<String, Integer> pageVisits) {
        List<String> popularPages = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : pageVisits.entrySet()) {
            if (entry.getValue() > 100) {
                popularPages.add(entry.getKey());
            }
        }
        return popularPages;
    }





}
