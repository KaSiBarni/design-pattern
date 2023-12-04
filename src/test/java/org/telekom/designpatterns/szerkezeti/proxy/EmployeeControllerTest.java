package org.telekom.designpatterns.szerkezeti.proxy;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeControllerTest {
    @Test
    public void testAddThenList() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeController employeeController =
                new EmployeeController(employeeService);

        employeeController.addEmployee(new Employee("John Doe"));

        List<Employee> employees = employeeController.listEmployees();
        assertThat(employees.size(), equalTo(1));

        assertThat(employees.get(0).getName(), equalTo("John Doe"));
    }

    @Test
    public void testWithValidation() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeService validatorService =  new ValidatorEmployeeService(employeeService);
        EmployeeController controller = new EmployeeController(validatorService);

        controller.addEmployee(new Employee("John Doe"));
        List<Employee> employees = controller.listEmployees();

        assertThat(employees.get(0).getName(), equalTo("John Doe"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalid() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeService validatorService = new ValidatorEmployeeService(employeeService);
        EmployeeController controller = new EmployeeController(validatorService);

        controller.addEmployee(new Employee(null));
    }

    @Test
    public void testHasRole() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeService validator = new ValidatorEmployeeService(employeeService);
        EmployeeService security = new SecurityEmployeeService((s) -> true, validator);
        EmployeeController controller = new EmployeeController(security);

        controller.addEmployee(new Employee("John Doe"));
        List<Employee> employees = controller.listEmployees();

        assertThat(employees.get(0).getName(), equalTo("John Doe"));
    }

    @Test(expected = SecurityException.class)
    public void testHasNoRole() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeService validator = new ValidatorEmployeeService(employeeService);
        EmployeeService security = new SecurityEmployeeService((s) -> false, validator);
        EmployeeController controller = new EmployeeController(security);

        controller.addEmployee(new Employee("John Doe"));
    }
}
