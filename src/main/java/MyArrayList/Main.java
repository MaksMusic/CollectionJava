package MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
   ArryCollection<String> nnn = new ArryCollection<>(11);


   nnn.add("qwe");
        nnn.add("qwe1");
        nnn.add("qwe2");
        nnn.add("qwe3");
        nnn.add("qwe4");
        nnn.add("qwe5");
        nnn.add("qwe5");
        Iterator iteratorNNN = nnn.iterator();
        Object[] nnn1 = nnn.toArray();
        System.out.println(Arrays.toString(nnn1));
        System.out.println(iteratorNNN.hasNext());


    }
}
