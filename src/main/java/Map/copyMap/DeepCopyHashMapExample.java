package Map.copyMap;

import java.util.HashMap;
import java.util.Map;

public class DeepCopyHashMapExample {
    public static void main(String[] args) {

        // ������� �������� ��������� HashMap
        HashMap<String, Person> originalMap = new HashMap<>();
        originalMap.put("person1", new Person("����", "������"));
        originalMap.put("person2", new Person("����", "������"));
        originalMap.put("person3", new Person("�����", "�������"));

        // ������� ����� ��������� HashMap � ������� ������������
        HashMap<String, Person> copiedMap1 = new HashMap<>(originalMap);

        // ������� �������� ����� ��������� HashMap �������
        HashMap<String, Person> copiedMap2 = new HashMap<>();
        for (Map.Entry<String,Person> originalPerson: originalMap.entrySet()) {
            Person copiedPerson = null;
            try {
                copiedPerson = (Person) originalPerson.getValue().clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            copiedMap2.put(originalPerson.getKey(), copiedPerson);
        }

        // ���������, ��� ����� ��������� �������
        System.out.println("�������� ��������� HashMap: " + originalMap);
        System.out.println("����� HashMap � ������� ������������: " + copiedMap1);
        System.out.println("�������� ����� HashMap: " + copiedMap2);
    }



    // ������ ������ Person
    static class Person implements Cloneable{
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
        return new Person(firstName,lastName);
        }

        @Override
        public String toString() {
            return "Person firstName=" + firstName + ", lastName=" + lastName;
        }
    }
}