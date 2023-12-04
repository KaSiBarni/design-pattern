package org.telekom.designpatterns.szerkezeti.flyweight;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MonthlyPayDetails {

    private static final Map<Double, MonthlyPayDetails> INSTANCES =
            Collections.synchronizedMap(new HashMap<>());
    private double amount;

    public static MonthlyPayDetails getInstance(double amount){
        return INSTANCES.computeIfAbsent(amount, MonthlyPayDetails::new);
    }
    public MonthlyPayDetails(double amount) {
        this.amount = amount;
    }

    public double pay(){
        return amount;
    }
}
