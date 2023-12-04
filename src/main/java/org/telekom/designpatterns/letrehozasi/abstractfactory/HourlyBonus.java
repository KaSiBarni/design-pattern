package org.telekom.designpatterns.letrehozasi.abstractfactory;

public class HourlyBonus implements Bonus{
    @Override
    public double bonus() {
        return 500;
    }
}
