package ArrayElement;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] firstArr = {1,2,3,4,5};
        SwapElements<Integer> obj1 = new SwapElements<>(firstArr);
        System.out.println(Arrays.toString(obj1.swap(1,3)));

        String[] secondArr = {"a", "b", "c", "d", "e", "f"};
        SwapElements<String> obj2 = new SwapElements<>(secondArr);
        System.out.println(Arrays.toString(obj2.swap(0,2)));

        /*Узнай, как передавать в объект класса SwapElements не ссылочный тип данных, а массив с примитивными данными*/

    }

}
