package org.telekom.designpatterns.proxy;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DynamicProxyTest {

    /**
     * Egy objektumhoz hozzáférést szabályoz helyettesítéssel, cserével
     * Remote, költséges objektumok (cache, lazy), védelmi ( hozzáférés szabályozás),
     * okos (naplózás, kölcsönös kizárás)
     *
     * JDK példa: RMI
     *
     * Java példa: EJB, Spring managed bean
     *
     * Tulajdonságok:
     * gyakran dependency injectionnel, így a kliensel nem tud a cseréről
     * Egymásba ágyazhatóak
     * Furcsa stacttrace
     * nem várt működés
     * Nehezebben debuggolható
     * 
     */

    @Test
    public void hasRole(){
        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeService securityService = SecurityInvocationHandler.createSecurityEmployeeService(
                (s) -> true, employeeService
        );

        securityService.addEmployee(new Employee("John Doe"));
        List<Employee> result = securityService.listEmployee();

        assertThat(result.size(), equalTo(1));
        assertThat(result.get(0).getName(), equalTo("John Doe"));
    }

    @Test(expected = SecurityException.class)
    public void hasNoRole(){
        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeService securityService = SecurityInvocationHandler.createSecurityEmployeeService(
                (s) -> false,
                employeeService
        );
        securityService.addEmployee(new Employee("John Doe"));


    }

}
