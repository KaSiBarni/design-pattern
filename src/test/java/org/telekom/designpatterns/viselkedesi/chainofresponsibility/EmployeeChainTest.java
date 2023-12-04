package org.telekom.designpatterns.viselkedesi.chainofresponsibility;

import org.junit.Test;
import org.telekom.designpatterns.viselkedesi.chainofresponsibility.Employee;
import org.telekom.designpatterns.viselkedesi.chainofresponsibility.EmployeeChain;
import org.telekom.designpatterns.viselkedesi.chainofresponsibility.Work;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeChainTest {

    /**
     * A kérés küldő és fogadó ne legyen egymáshoz kötve, dinamikusan változtatható legyen
     * Kérelem addig halad végig a felelősségi láncon amíg valaki le nem tdja kezelni.
     * Kérelem megfogalmazásakor nem ismerjük a konkrét fogadót
     *
     * GOF példa: context sensitive help
     * JDK példa: exception handling
     * Java példa: Log4J appender
     *
     * TUlajdonságok:
     *      - Láncot akár futási időben változtathatjuk
     *      - Kérelem végighaladása megszakítható
     *      - Gyakran a Composite tervezési mintával együtt
     *
     */

    @Test
    public void testFinish(){
        List<Employee> employeeList =
                Arrays.asList(
                        new Employee("John Doe", w -> false),
                        new Employee("Jack Doe", w -> true),
                        new Employee("Jane Doe", w -> false)
                );
        EmployeeChain employeeChain = new EmployeeChain(employeeList);

        Work work = new Work("Work1");
        employeeChain.finish(work);

        assertThat(work.isFinished(), equalTo(true));
        assertThat(work.getEmployee().getName(), equalTo("Jack Doe"));

    }
}
