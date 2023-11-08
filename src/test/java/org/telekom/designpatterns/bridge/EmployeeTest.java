package org.telekom.designpatterns.bridge;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeTest {

    @Test
    public void test_monthly_amount(){
        Employee employee = new Employee("John Doe", new MonthlyPayDetails(500), new MonthlyBonus(50));

        double amount = employee.pay();

        assertThat(amount, equalTo(550d));
    }

    @Test
    public void test_hourly_amount_without_bonus(){
        Employee employee = new Employee("John Doe", new HourlyPayDetails(50, 5), new HourlyBonus(5));

        double amount = employee.pay();

        assertThat(amount, equalTo(250d));
    }

    @Test
    public void test_hourly_amount_with_bonus(){
        Employee employee = new Employee("John Doe", new HourlyPayDetails(50, 200), new HourlyBonus(200));

        double amount = employee.pay();

        assertThat(amount, equalTo(10050d));
    }
}
