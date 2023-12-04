package org.telekom.designpatterns.letrehozasi.factorymethod;

public class HourlyPayDetailsFactory implements PayDetailsFactory{
    @Override
    public PayDetails create() {
        return new HourlyPayDetails(0,0);
    }
}
