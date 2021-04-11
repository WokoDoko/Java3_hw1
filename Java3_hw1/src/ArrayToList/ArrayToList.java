package ArrayToList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList<A> {

    private final A[] array;

    public ArrayToList(A[] array) {
        this.array = array;
    }

    public A[] getArray() {
        return array;
    }

    public void conversionFirst(ArrayToList a) {
        ArrayList<A> newArrayList = new ArrayList<>(this.array.length);
        for (int i = 0; i < array.length; i++) {
            newArrayList.add(i, this.array[i]);
            System.out.println(newArrayList.get(i));
        }
    }

    public void conversionSecond(A[] array) {
        ArrayList<A> newArrayList = new ArrayList<>(this.array.length);
        for (int i = 0; i < array.length; i++) {
            newArrayList.add(i, array[i]);
            System.out.println(newArrayList.get(i));
        }
    }

    public void conversionThird(A[] array) {
        List<A> list;
        list = Arrays.asList(array);
        for (A a : list) {
            System.out.println(a);
        }
    }
}
