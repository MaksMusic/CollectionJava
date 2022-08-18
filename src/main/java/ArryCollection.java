import java.util.*;

public class ArryCollection<T> implements Collection<T> {
    private T[] array;
    Collection collection ;
    private T t ;
    private  int r;

    public ArryCollection(int n) {
        this.array =  (T[]) new Object[n];
    }
    public ArryCollection() {
        this.array =  (T[]) new Object[10];
    }

    @Override
    public int size() {            // размер массива
        return array.length;
    }

    @Override
    public boolean isEmpty() {    //  возращает true или folse если коллеция пустая или не пустая
        return array.length == 0;
    }

    @Override
    public boolean contains(Object o) {      // проверяет содержится ли элемент уже в массиве
        for (var i : array) {
            if (o.equals(i)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public Iterator<T> iterator() {


        return new Iterator<T>() {


            @Override
            public boolean hasNext() { //есть и следующий?
                return r < array.length;
            }

            @Override
            public T next() { // возвращает следующий
                return array[r+1];
            }
        };
    }

    @Override
    public Object[] toArray() {
        T n[] = (T[]) new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            n[i] = array[i];
        }
        return n;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if (a.length < array.length) {
            a = (T1[]) Arrays.copyOf(a, array.length);
        }
        for (int i = 0; i < array.length; i++) {
            a[i] = (T1) array[i];
        }

        return a;
    }

    @Override
    public boolean add(T t) {      // добавить элементы в массив
        if (contains(t)) {        //проверка есть ли это уже в массиве
            return false;
        }

        array = Arrays.copyOf(array, array.length + 1); // увеличивает длину массива
        array[array.length - 1] = t;
        this.t=t;
        this.r=array.length - 1;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = 0;
        if (contains(o)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(o)) {
                    index = i;
                }
            }
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            array = Arrays.copyOf(array, array.length - 1);
            return true;
        } else
            return false;

    }

    @Override
    public boolean containsAll(Collection<?> c) { //проверка содержимого колекции на то что есть ли все это уже в сущ колекции
        if (c.isEmpty()) {
            return false;
        }

        for (var i : c) {
            if (!contains(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {   //добавить все что есть в колекции с

        for (T t : c) {
            if (contains(t)) {
                return false;
            }
        }
        for (T t : c) {
            add(t);
        }
        return true;
    }
    //проверить есть ли что то из содержимого  из коллекции с в данной
    //если ничего нет то добавляем


    @Override
    public boolean removeAll(Collection<?> c) {      //удаляет все элементы с коллекции которые в списке
        boolean n = false;
        if (c.isEmpty()) {
            return false;
        }
        for (Object t : c) {
            if (contains(t)) {
                remove(t);
                n = true;
            }
        }
        return n;
    }

    @Override
    public boolean retainAll(Collection<?> c) {        // удаляет все элементы которых нету в коллекции с
        if (c.isEmpty()) {
            return false;
        }
        boolean n = false;
        for (Object t : c) {
            if (contains(t)) {
                n = true;
                remove(t);
            }
        }
        return n;
    }

    @Override
    public void clear() {                          //очистить коллекцию
        array = (T[]) new Object[0];

    }


}
