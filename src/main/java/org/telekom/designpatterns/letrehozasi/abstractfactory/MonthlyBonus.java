package org.telekom.designpatterns.letrehozasi.abstractfactory;

public class MonthlyBonus implements Bonus{
    @Override
    public double bonus() {
        return 500;
    }
}
