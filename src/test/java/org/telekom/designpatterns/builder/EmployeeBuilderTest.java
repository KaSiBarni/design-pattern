package org.telekom.designpatterns.builder;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeBuilderTest {

    @Test
    public void test_employee_build(){
        //fluent interface ezért szépen lehet láncolni a methodusokat
        Employee employee = new EmployeeBuilder().setName("John Doe").setBase(1000).setHours(50).builder();
        assertThat(employee.getName(), equalTo("John Doe"));
        assertThat(employee.getPayDetails().pay(), equalTo(50000d));

    }

    @Test
    public void test_employee_build_default_base(){
        //fluent interface
        Employee employee = new EmployeeBuilder().setName("John Doe").setHours(50).builder();
        assertThat(employee.getName(), equalTo("John Doe"));
        assertThat(employee.getPayDetails().pay(), equalTo(40000d));

    }

    @Test(expected = IllegalStateException.class)
    public void test_employee_build_without_name(){
        //fluent interface
        new EmployeeBuilder().setBase(1000).setHours(50).builder();
    }
}
