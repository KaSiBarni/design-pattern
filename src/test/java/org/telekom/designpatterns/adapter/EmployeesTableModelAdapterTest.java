package org.telekom.designpatterns.adapter;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeesTableModelAdapterTest {

    /**
     * Meglévő objektum nem implementálja az elvárt interfészt, de használni akarjuk
     * inkompatibilitás feloldása
     * Esetleg nem tudjuk modosítani
     *
     * Gyakori félreértés: interfészt implementáló osztály üre metódus implementációkkal
     *  (Java 8 óta default metódusok)
     *
     * JDK példa: InputStreamReader
     *
     *
     */
    @Test
    public void test_create(){
        List<Employee> employees = Arrays.asList(
                new Employee(1L, "John Doe", LocalDate.of(1980,1,1)),
                new Employee(1L, "Jane Doe", LocalDate.of(1990,1,10)),
                new Employee(1L, "Rob Doe", LocalDate.of(1999,5,11))
        );
        EmployeesTableModelAdapter adapter = new EmployeesTableModelAdapter( employees );

        assertThat(adapter.getColumns().get(1), equalTo("Name"));
        assertThat(adapter.getRowCount(), equalTo(3));
        assertThat(adapter.getValue(0,0), equalTo("1"));
        assertThat(adapter.getValue(0,1), equalTo("John Doe"));

    }
}
