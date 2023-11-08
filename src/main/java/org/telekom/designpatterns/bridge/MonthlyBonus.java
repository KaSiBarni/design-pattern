package org.telekom.designpatterns.bridge;

public class MonthlyBonus implements Bonus {

    private double amount;

    public MonthlyBonus(double amount) {
        this.amount = amount;
    }

    @Override
    public double payBonus() {
        return amount;
    }
}
