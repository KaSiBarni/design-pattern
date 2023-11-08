package org.telekom.designpatterns.simplefactory;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PayDetailsFactoryTest {

    @Test
    public void create_Hourly_Test(){
        PayDetails payDetails = new PayDetailsFactory().create("H;1000;50");
        assertThat(payDetails.getClass(), equalTo(HourlyPayDetails.class));
        assertThat(((HourlyPayDetails) payDetails).getBase(), equalTo(1000d));
        assertThat(((HourlyPayDetails) payDetails).getHours(), equalTo(50));
    }

    @Test
    public void create_Monthly_Test(){
        PayDetails payDetails = new PayDetailsFactory().create("M;100000");
        assertThat(payDetails.getClass(), equalTo(MonthlyPayDetails.class));
        assertThat(((MonthlyPayDetails) payDetails).getMonthlyAmount(), equalTo(100000d));
    }
}
