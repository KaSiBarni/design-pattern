package org.telekom.designpatterns.letrehozasi.simplefactory;

public class HourlyPayDetails implements PayDetails{

    private double base;
    private int hours;

    public HourlyPayDetails(double base, int hours) {
        this.base = base;
        this.hours = hours;
    }

    @Override
    public double pay() {
        return base*hours;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
