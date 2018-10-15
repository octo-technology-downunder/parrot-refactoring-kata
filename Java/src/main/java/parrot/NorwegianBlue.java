package parrot;

public class NorwegianBlue extends Parrot {

    private static final double MAX_SPEED = 24.0;
    private final double voltage;

    NorwegianBlue(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : Math.min(MAX_SPEED, voltage * BASE_SPEED);
    }
}
