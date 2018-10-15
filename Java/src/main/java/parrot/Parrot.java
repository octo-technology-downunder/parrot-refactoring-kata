package parrot;

public abstract class Parrot {

    protected static final double BASE_SPEED = 12.0;
    protected boolean isNailed;

    public abstract double getSpeed();

    public static AfricanParrot getAfricanParrot(int numberOfCoconuts){
        return new AfricanParrot(numberOfCoconuts);
    }
}
