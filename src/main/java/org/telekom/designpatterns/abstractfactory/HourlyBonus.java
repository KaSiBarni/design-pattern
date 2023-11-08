package org.telekom.designpatterns.abstractfactory;

public class HourlyBonus implements Bonus{
    @Override
    public double bonus() {
        return 500;
    }
}
