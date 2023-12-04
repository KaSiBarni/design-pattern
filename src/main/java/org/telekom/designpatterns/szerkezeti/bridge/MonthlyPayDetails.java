package org.telekom.designpatterns.szerkezeti.bridge;

public class MonthlyPayDetails implements PayDetails {

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
