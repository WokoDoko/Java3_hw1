package Fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<F extends Fruit> {

    private List<F> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public float getMass() {
        if (fruits.isEmpty()) return 0.0f;
        return fruits.get(0).getMass() * fruits.size();

    }

    public List<F> getFruits() {
        return fruits;
    }

    public boolean compare (Box<? extends Fruit> box) {
        return getMass()== box.getMass();
    }

    public void shift (Box<F> box) {
        fruits.addAll(box.getFruits());
        box.getFruits().clear();
    }

    public void add(F fruit) {
        fruits.add(fruit);
    }

}
