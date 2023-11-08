package org.telekom.designpatterns.prototype;

public class HourlyPayDetails implements PayDetails {

    private double baseAmount;
    private int workHours;

    public HourlyPayDetails(double baseAmount, int workHours) {
        this.baseAmount = baseAmount;
        this.workHours = workHours;
    }

    //Ez egy másik és szebb és gyorsabb használata a copyzásnak
    public HourlyPayDetails(HourlyPayDetails hourlyPayDetails) {
        this.baseAmount = hourlyPayDetails.baseAmount;
        this.workHours = hourlyPayDetails.workHours;
    }

    @Override
    public double pay() {
        return baseAmount*workHours;
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
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
