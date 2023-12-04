package org.telekom.designpatterns.letrehozasi.abstractfactory;

public class MonthlyEmployeeDetailsFactory implements EmployeeDetailsFactory {

    @Override
    public PayDetails createPayDetails() {
        return new MonthlyPayDetails(0);
    }

    @Override
    public Bonus createBonus() {
        return new MonthlyBonus();
    }
}
