package org.telekom.designpatterns.singleton;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeDaoTest {

    @Test
    public void test_get_instance(){

        EmployeeDao employeeDao = EmployeeDao.getInstance();

        EmployeeDao another = EmployeeDao.getInstance();

        assertThat(employeeDao, equalTo(another));
    }
}
