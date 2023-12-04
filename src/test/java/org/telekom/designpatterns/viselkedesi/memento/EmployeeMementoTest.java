package org.telekom.designpatterns.viselkedesi.memento;

import org.junit.Test;
import org.telekom.designpatterns.viselkedesi.memento.Employee;
import org.telekom.designpatterns.viselkedesi.memento.EmployeeMemento;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeMementoTest {

    /**
     * Objektum előző állapotának megőrzése
     * UNDO, REDO
     *
     */

    @Test
    public void testMemento(){
        Employee employee = new Employee("John Doe", 1000L);

        //szabályos Verem műveletek
        Deque<EmployeeMemento> mementos = new ArrayDeque<>();

        mementos.push(employee.save());

        employee.setSalary(1200L);

        mementos.push(employee.save());

        employee.setName("Jack Doe");

        assertThat(employee.getName(), equalTo("Jack Doe"));

        employee.restore(mementos.pop());

        assertThat(employee.getName(), equalTo("John Doe"));
        assertThat(employee.getSalary(), equalTo(1200L));

        employee.restore(mementos.pop());
        assertThat(employee.getSalary(), equalTo(1000L));
    }
}
