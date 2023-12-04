package org.telekom.designpatterns.letrehozasi.simplefactory;

public class MonthlyPayDetails implements PayDetails{

    private double monthlyAmount;

    public MonthlyPayDetails(double monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    @Override
    public double pay() {
        return monthlyAmount;
    }

    public double getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(double monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }
}
