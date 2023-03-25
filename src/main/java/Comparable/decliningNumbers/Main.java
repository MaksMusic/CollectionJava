package Comparable.decliningNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    /**
     * Отсортировать список пользователей по возрасту, а при одинаковом возрасте - по имени в алфавитном порядке.
     */

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(22,"Dina"));
        users.add(new User(22,"Anna"));
        users.add(new User(32,"Sofia"));
        users.add(new User(42,"Yana"));
        users.add(new User(18,"Artur"));
        users.add(new User(20,"Tomas"));


//Lambda
//
//
//        Comparator<User> compareByAgeThenName = Comparator.comparing(User::getAge)
//                .thenComparing(User::getName);
//        Collections.sort(users, compareByAgeThenName);


        Comparator<User> compareByAgeThenName = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int result = Integer.compare(o1.getAge(), o2.getAge());
                if (result == 0) {
                    result = o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        };

        Collections.sort(users, compareByAgeThenName);

        for (User user : users) {
            System.out.println(user);
        }
    }


}
