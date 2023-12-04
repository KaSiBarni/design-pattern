package org.telekom.designpatterns.letrehozasi.abstractfactory;

public class HourlyEmployeeDetailsFactory implements EmployeeDetailsFactory {
    @Override
    public PayDetails createPayDetails() {
        return new HourlyPayDetails(0,0);
    }

    @Override
    public Bonus createBonus() {
        return new HourlyBonus();
    }
}
