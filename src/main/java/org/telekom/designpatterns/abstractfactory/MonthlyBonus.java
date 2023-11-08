package org.telekom.designpatterns.abstractfactory;

public class MonthlyBonus implements Bonus{
    @Override
    public double bonus() {
        return 500;
    }
}
