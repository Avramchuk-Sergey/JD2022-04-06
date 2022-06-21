package by.it.avramchuk.calc.entity;

import by.it.avramchuk.calc.exception.CalcException;
import by.it.avramchuk.calc.interfaces.Operation;

public abstract class Var implements Operation {






    @Override
    public String toString() {
        return "Var{}";
    }

    @Override
    public Var add(Var other) throws CalcException {
        throw new CalcException("Incorrect operation %s + %s%n", this, other);
    }

    @Override
    public Var sub(Var other) throws CalcException{
        throw new CalcException("Incorrect operation %s - %s%n", this, other);
    }

    @Override
    public Var mul(Var other) throws CalcException{
        throw new CalcException("Incorrect operation %s * %s%n", this, other);
    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException("Incorrect operation %s / %s%n", this, other);
    }
}