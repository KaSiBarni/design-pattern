package org.telekom.designpatterns.decorator;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UnmodifiedEmployeeTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testUnModify(){
        Employee employee = new EmployeeImpl(1L, "John Doe");
        Employee decorated = new UnmodifiedEmployee(employee);

        assertThat(decorated.getName(), equalTo("John Doe"));

        decorated.setName("Jack Doe");
    }
}
