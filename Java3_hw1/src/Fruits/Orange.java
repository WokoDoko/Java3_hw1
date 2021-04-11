package Fruits;

public class Orange extends Fruit{

    private static final float MASS = 1.5f;
    private static final String type = "Orange";

    public Orange() {
        super(MASS, type);
    }

    public static double getMASS() {
        return MASS;
    }

    @Override
    public String getType() {
        return type;
    }
}
