package org.telekom.designpatterns.decorator;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoaderEmployeeTest {

    @Test
    public void TestLoad(){
        Employee employee = new EmployeeImpl(0L,null);
        LoaderEmployee loaderEmployee = new LoaderEmployee(employee);

        loaderEmployee.load("11 ;John Doe");

        Employee another = loaderEmployee;

        assertThat(another.getId(), equalTo(11L));
        assertThat(another.getName(), equalTo("John Doe"));

    }

}
