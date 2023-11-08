package org.telekom.designpatterns.intro.composition;

public class HourlyPayDetails implements PayDetails{

    private double baseAmount;
    private int workHours;

    public HourlyPayDetails(double baseAmount, int workHours) {
        this.baseAmount = baseAmount;
        this.workHours = workHours;
    }

    @Override
    public double pay() {
        return baseAmount*workHours;
    }
}
