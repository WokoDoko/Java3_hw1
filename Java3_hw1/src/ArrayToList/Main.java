package ArrayToList;

import java.util.Arrays;

public class Main<A> {


    public static void main(String[] args) {

        String[] stringsArr = {"one", "two", "three"};
        Integer[] intArr = {1, 2, 3, 4, 5};

        ArrayToList a = new ArrayToList(stringsArr);

        a.conversionFirst(a);
        a.conversionSecond(intArr);
        a.conversionThird(intArr);
        System.out.println(Arrays.toString(stringsArr));
        System.out.println(Arrays.toString(intArr));

    }
}
