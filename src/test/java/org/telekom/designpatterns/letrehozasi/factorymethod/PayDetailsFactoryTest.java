package org.telekom.designpatterns.letrehozasi.factorymethod;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PayDetailsFactoryTest {

    /**
     * Interface különböző implementációjának példányosítására
     *
     * Létrehozandó objektum interfésze ismert
     * Factory method esetén a létrehozónak is az interfésze definiált
     *
     * Különböző implementációi különböző implementációt példánysítanak
     *
     */

    @Test
    public void test_hourly(){
        PayDetailsFactory factory = new HourlyPayDetailsFactory();
        PayDetails payDetails = factory.create();
        assertThat(payDetails.getClass(), equalTo(HourlyPayDetails.class));
    }

    @Test
    public void test_monthly(){
        PayDetailsFactory factory = new MonthlyPayDetailsFactory();
        PayDetails payDetails = factory.create();
        assertThat(payDetails.getClass(), equalTo(MonthlyPayDetails.class));
    }
}
