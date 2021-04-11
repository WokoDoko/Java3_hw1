package Fruits;

public class Fruit {

    private final float mass;
    private final String type;

    public Fruit(float mass, String type) {
        this.mass = mass;
        this.type = type;
    }

    public float getMass() {
        return mass;
    }

    public String getType() {
        return type;
    }

}
