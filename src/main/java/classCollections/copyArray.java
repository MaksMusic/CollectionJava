package classCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class copyArray {
    static class Person implements Cloneable{
        private String name;

        @Override
        public String toString() {
            return name;
        }

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new Person(name);
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Dima1");
        Person person2 = new Person("Dima2");
        Person person3 = new Person("Dima3");
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);


        List<Person> list = listCopy(listPerson);


        System.out.println(listPerson);
        System.out.println(list);


    }

    public static List<Person> listCopy(List<Person>b1){
        List<Person> listCopy=new ArrayList<>();

        for (Person person : b1) {
            try {
                System.out.println(((Person)person.clone()).name );
                listCopy.add( (Person) person.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        return listCopy;
    }
}
