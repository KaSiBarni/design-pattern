package org.telekom.designpatterns.factorymethod;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PayDetailsFactoryTest {

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
