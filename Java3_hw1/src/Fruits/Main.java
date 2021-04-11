package Fruits;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();


        Box<Apple> boxOfApples = new Box<>();
        Box<Orange> boxOfOranges = new Box<>();
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

        System.out.println(boxOfApples.compare(boxOfOranges));
        System.out.println(boxOfApples.compare(boxOfApples));



    }

}
