package parrot;

public class ParrotFactory {

    public static Parrot create(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        if (type == ParrotTypeEnum.EUROPEAN) {
            return new EuropeanParrot();
        } else if (type == ParrotTypeEnum.AFRICAN) {
            return new AfricanParrot(numberOfCoconuts);
        } else if (type == ParrotTypeEnum.NORWEGIAN_BLUE) {
            return new NorwegianBlueParrot(voltage, isNailed);
        }
        throw new RuntimeException("Should be unreachable");
    }

}
