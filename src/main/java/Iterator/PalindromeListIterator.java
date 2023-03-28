package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PalindromeListIterator {

    public static boolean isPalindrome(String input) {
        // Превращаем строку в список символов
        List<Character> charList = new ArrayList<Character>();
        for (char c : input.toCharArray()) {
            charList.add(c);
        }

        // Создаем два ListIterator'а для перебора символов строки
        ListIterator<Character> iterator = charList.listIterator();
        ListIterator<Character> reverseIterator = charList.listIterator(charList.size());

        // Сравниваем соответствующие символы в прямом и обратном порядке
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            char nextChar = Character.toLowerCase(iterator.next());
            char prevChar = Character.toLowerCase(reverseIterator.previous());
            if (nextChar != prevChar) {
                return false;
            }
        }

        // Если все символы совпадают, то строка является палиндромом
        return true;
    }

    public static void main(String[] args) {
        String input1 = "A man a plan a canal Panama";
        String input2 = "Hello world";

        boolean isInput1Palindrome = isPalindrome(input1);
        boolean isInput2Palindrome = isPalindrome(input2);

        System.out.println(input1 + " is palindrome? " + isInput1Palindrome);
        System.out.println(input2 + " is palindrome? " + isInput2Palindrome);


    }


}