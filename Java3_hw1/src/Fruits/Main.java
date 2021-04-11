package Fruits;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();


        Box<Apple> boxOfApples = new Box<>();
        Box<Orange> boxOfOranges = new Box<>();
        Box<Orange> boxOfOranges2 = new Box<>();
        boxOfApples.add(apple);
        boxOfApples.add(apple);
        boxOfApples.add(apple);
        boxOfApples.add(apple);
        boxOfApples.add(apple);
        boxOfApples.add(apple);

        boxOfOranges.add(orange);
        boxOfOranges.add(orange);
        boxOfOranges.add(orange);
        boxOfOranges.add(orange);
        boxOfOranges.add(orange);
        boxOfOranges.add(orange);

        boxOfOranges2.shift(boxOfOranges);

        System.out.println(boxOfApples.compare(boxOfOranges));
        System.out.println(boxOfOranges.compare(boxOfOranges2));
        System.out.println(boxOfApples.compare(boxOfApples));

        System.out.println(boxOfOranges.getMass());
        System.out.println(boxOfOranges2.getMass());
        System.out.println(boxOfApples.getMass());


    }

}
