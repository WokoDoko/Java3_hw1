package Fruits;

public class Apple extends Fruit{

    private static final float MASS = 1.0f ;
    private static final String type = "Apple";

    public Apple() {
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
