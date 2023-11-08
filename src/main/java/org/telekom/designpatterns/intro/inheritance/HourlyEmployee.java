package org.telekom.designpatterns.intro.inheritance;

public class HourlyEmployee extends Employee{

    private double baseAmount;
    private int workHours;

    public HourlyEmployee(String name, double baseAmount, int workHours) {
        super(name);
        this.baseAmount = baseAmount;
        this.workHours = workHours;
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public double pay() {
        //Getterek használata
        return baseAmount*workHours;
    }
}
