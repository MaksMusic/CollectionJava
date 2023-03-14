import MyArrayList.ArryCollection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ArryCollectionTest {


    @Test
    public void isEmptyTest() {
        ArryCollection<Integer> arryCollection = new ArryCollection<>();
        Assertions.assertTrue(arryCollection.isEmpty());
        Assertions.assertEquals(0, arryCollection.size());
        arryCollection.add(2);
        Assertions.assertFalse(arryCollection.isEmpty());
        Assertions.assertEquals(1, arryCollection.size());
    }

    @Test
    public void containsTest() {
        ArryCollection<Integer> arryCollection = new ArryCollection<>();
        arryCollection.add(2);
        arryCollection.add(21);
        Assertions.assertFalse(arryCollection.add(21));
        Assertions.assertFalse(arryCollection.contains(3));
        Assertions.assertTrue(arryCollection.contains(2));

    }

    @Test
    public void containsAllTest() {
        ArryCollection<Integer> arryCollection = new ArryCollection<>();
        arryCollection.add(7);
        arryCollection.add(71);
        arryCollection.add(17);
        List<Integer> listtest = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        listtest.add(7);
        listtest.add(71);
        Assertions.assertTrue(arryCollection.containsAll(listtest));
        Assertions.assertFalse(arryCollection.containsAll(emptyList));
        listtest.add(-1);
        Assertions.assertFalse(arryCollection.containsAll(listtest));
    }


    @Test
    public void clearTest() {
        ArryCollection k = new ArryCollection();
        k.add(4);
        k.add(5);
        Assertions.assertEquals(2, k.size());
        k.clear();
        Assertions.assertEquals(0, k.size());


    }

    @Test
    public void addAllTest() {
        List list = new LinkedList();
        list.add(5);
        list.add(3);
        ArryCollection arryCollection = new ArryCollection();
        arryCollection.add(5);
        Assertions.assertFalse(arryCollection.addAll(list));
        //Assertions.assertTrue(arryCollection.addAll(list));
        Assertions.assertEquals(1, arryCollection.size());


    }

    @Test
    public void addAllTestTrue() {
        List list = new LinkedList();
        list.add(5);
        list.add(3);
        ArryCollection arryCollection = new ArryCollection();
        arryCollection.add(6);
        Assertions.assertTrue(arryCollection.addAll(list));
        Assertions.assertEquals(3, arryCollection.size());

    }

    @Test
    public void removeTest() {
        ArryCollection arryCollection = new ArryCollection();
        arryCollection.add(6);
        arryCollection.add(3);
        arryCollection.add(2);
        arryCollection.add(3);
        arryCollection.remove(3);
        Assertions.assertEquals(2, arryCollection.size());
    }

    @Test
    public void removeTestFalse() {
        ArryCollection arryCollection = new ArryCollection();
        arryCollection.add(6);
        arryCollection.add(3);
        Assertions.assertFalse(arryCollection.remove(8));
    }

    @Test
    public void removeallTest() {
        ArryCollection arryCollection = new ArryCollection();
        List list = new LinkedList();
        arryCollection.add(5);
        arryCollection.add(3);
        arryCollection.add(3);
        arryCollection.add(33);
        arryCollection.add(4);
        arryCollection.add(1);
        arryCollection.add(2);
        arryCollection.add(3);
        arryCollection.add(2);
        arryCollection.add(12);
        arryCollection.add(6);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        Assertions.assertTrue(arryCollection.removeAll(list));
    }

    @Test
    public void retainAllTest() {
        ArryCollection arryCollection = new ArryCollection();
        List list = new LinkedList();
        arryCollection.add(5);
        arryCollection.add(123);
        arryCollection.add(5);
        arryCollection.add(5);
        arryCollection.add(5);
        arryCollection.add(3);
        arryCollection.add(2);
        list.add(5);
        list.add(3);
        list.add(3);


        Assertions.assertTrue(arryCollection.retainAll(list));
        Assertions.assertEquals(2, arryCollection.size());


    }

    @Test
    public void toArrayTest() {
        ArryCollection<Integer> arryCollection = new ArryCollection<>();
        arryCollection.add(521);
        arryCollection.add(123);
        arryCollection.add(51);
        arryCollection.add(52);
        Object k[] = arryCollection.toArray();
        Assertions.assertEquals(4, k.length);
        Assertions.assertArrayEquals(new Integer[]{521, 123, 51, 52}, k);
    }

    @Test
    public void toArray1Test() {
        ArryCollection<Integer> arryCollection = new ArryCollection<>();
        arryCollection.add(1);
        arryCollection.add(2);
        arryCollection.add(3);
        arryCollection.add(32);
        arryCollection.add(31);
        Integer[] n = new Integer[]{1, 2, 3, 32, 31};
        Assertions.assertArrayEquals(n, arryCollection.toArray(new Integer[0]));
    }

    @Test
    public void iteratotTest() {
        ArryCollection<Integer> arryCollection = new ArryCollection<>();
        arryCollection.add(2);
        Iterator<Integer> iterator = arryCollection.iterator();
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(2, iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

}
