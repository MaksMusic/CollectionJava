package Map.copyMap;

import java.util.HashMap;
import java.util.Map;

public class DeepCopyHashMapExample {
    public static void main(String[] args) {

        // Создаем исходную коллекцию HashMap
        HashMap<String, Person> originalMap = new HashMap<>();
        originalMap.put("person1", new Person("Иван", "Иванов"));
        originalMap.put("person2", new Person("Петр", "Петров"));
        originalMap.put("person3", new Person("Сидор", "Сидоров"));

        // Создаем копию коллекции HashMap с помощью конструктора
        HashMap<String, Person> copiedMap1 = new HashMap<>(originalMap);

        // Создаем глубокую копию коллекции HashMap вручную
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

        // Проверяем, что копии создались успешно
        System.out.println("Исходная коллекция HashMap: " + originalMap);
        System.out.println("Копия HashMap с помощью конструктора: " + copiedMap1);
        System.out.println("Глубокая копия HashMap: " + copiedMap2);
    }



    // Пример класса Person
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