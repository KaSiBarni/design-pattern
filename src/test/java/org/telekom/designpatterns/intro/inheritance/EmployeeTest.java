package org.telekom.designpatterns.intro.inheritance;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeTest {

    @Test
    public void testMonthlyPay(){
        Employee employee = new MonthlyEmployee("Jhon Doe", 100_000);
        double amount = employee.pay();

        assertThat(amount, equalTo(100_000d));
    }

    @Test
    public void testHourlyPay(){
        Employee employee = new HourlyEmployee("Jhon Doe", 100, 50);
        double amount = employee.pay();

        assertThat(amount, equalTo(5000d));
    }
}
