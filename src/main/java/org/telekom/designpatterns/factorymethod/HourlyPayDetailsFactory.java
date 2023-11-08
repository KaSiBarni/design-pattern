package org.telekom.designpatterns.factorymethod;

public class HourlyPayDetailsFactory implements PayDetailsFactory{
    @Override
    public PayDetails create() {
        return new HourlyPayDetails(0,0);
    }
}
