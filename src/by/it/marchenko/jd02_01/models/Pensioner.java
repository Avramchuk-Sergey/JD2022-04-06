package by.it.marchenko.jd02_01.models;

import static by.it.marchenko.jd02_01.constants.CustomerConstant.*;

public class Pensioner extends Customer {

    public Pensioner() {
        super();
    }

    @Override
    public double getSpeedDownCoefficient() {
        return PENSIONER_SPEED_DOWN_COEFFICIENT;
    }

    @Override
    public String toString() {
        String name = super.getName();
        int id = super.getId();
        return String.format("%-10s #%-3d %7s ", PENSIONER, id, name);

    }
}
