package parrot;

public class EuropeanParrot extends Parrot {

    @Override
    public double getSpeed() {
        System.out.println("Overriding parent behaviour");
        return BASE_SPEED;
    }
}
