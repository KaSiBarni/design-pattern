package org.telekom.designpatterns.intro.composition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeTest {

    @Test
    public void test_Monthly_Composition_Pay(){
        Employee employee = new Employee("Jhon Doe", new MonthlyPayDetails(100_000));
        double amount = employee.pay();
        assertThat(amount, equalTo(100_000d));
    }

    @Test
    public void test_Hourly_Composition_Pay(){
        Employee employee = new Employee("John Doe", new HourlyPayDetails(1000, 50));
        double amount = employee.pay();
        assertThat(amount, equalTo(50000d));
    }

    //Egyszerű a változtatás és rugalmas
    @Test
    public void test_Change_Employee_Payment_From_Monthly_To_Hourly(){
        Employee employee = new Employee("John Doe", new MonthlyPayDetails(100_000));
        employee.setPayDetails(new HourlyPayDetails(1000,50));
        double amount = employee.pay();
        assertThat(amount, equalTo(50000d));
    }

    //Delegálja a kérést az Employee a megadott payDetails objektumnak
    //Külön tesztelhetőek az objektumok
    @Test
    public void test_Pay_With_Stub(){
        Employee employee=new Employee("Jane Doe", () -> 5);
        double amount = employee.pay();
        assertThat(amount, equalTo(5d));
    }
}
