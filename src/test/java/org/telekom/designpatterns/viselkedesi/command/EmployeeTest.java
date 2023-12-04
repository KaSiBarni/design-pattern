package org.telekom.designpatterns.viselkedesi.command;

import org.junit.Test;
import org.telekom.designpatterns.viselkedesi.command.ChangeNameCommand;
import org.telekom.designpatterns.viselkedesi.command.ChangeSalaryCommand;
import org.telekom.designpatterns.viselkedesi.command.Command;
import org.telekom.designpatterns.viselkedesi.command.Employee;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeTest {

    /**
     * Kérelem kiszervezése eyg külön objektumba
     * Végrehajtó és kérelem szétválasztása
     * Kliens és végrehajtó szétválasztása
     *
     * GOF példa: menü, timer
     * JDK példa: Runnble
     * Architektúrális példa: CQRS (Command Query Responsibility Segregation)
     *
     * Tulajdonságok:
     *      - Elágazások kiváltására
     *      - History, naplózás
     *      - Undo, Redo
     *      - Távoli híváshoz
     *      - Sorba rendezhető, priolizálható
     *      - Asszinkron, végrehajtható dönt a végrehajtás idejéről
     *      - Párhuzamosítható
     *      - Null object: üres command (nem GOF)
     */
    @Test
    public void testChangeSalary(){
        Employee employee = new Employee("John Doe", 1000L);
        Command command = new ChangeSalaryCommand(200L);

        employee.accept(command);

        assertThat(employee.getSalary(), equalTo(1200L));
    }

    @Test
    public void testHistory(){
        Employee employee = new Employee("John Doe", 1000L);
        assertThat(employee.getCommandList().size(), equalTo(0));

        Command command = new ChangeSalaryCommand(200L);
        employee.accept(command);
        assertThat(employee.getCommandList().size(), equalTo(1));
    }

    @Test
    public void testChangeName(){
        Employee employee = new Employee("John Doe", 1000L);
        Command command = new ChangeNameCommand("Jack Doe");
        employee.accept(command);

        assertThat(employee.getName(), equalTo("Jack Doe"));
    }

    @Test
    public void testUndo(){
        Employee employee = new Employee("John Doe", 1000L);
        employee.accept(new ChangeSalaryCommand(200L));

        assertThat(employee.getSalary(), equalTo(1200L));

        employee.undo();

        assertThat(employee.getSalary(), equalTo(1000L));
    }
}
