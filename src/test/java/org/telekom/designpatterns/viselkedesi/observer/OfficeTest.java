package org.telekom.designpatterns.viselkedesi.observer;

import org.junit.Test;
import org.telekom.designpatterns.viselkedesi.observer.Employee;
import org.telekom.designpatterns.viselkedesi.observer.Office;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class OfficeTest {

    /**
     * Egy objektum állapotváltozásáról több objektum kap értesítést
     * Laza kapcsolat a megfigyelt objektumok és megfigyelők között
     * Az értesítésről le lehet iratkozni.
     *
     * Architektúrális példa : MVC
     * JDK példa: java.beans csomag
     * Java EE példa: ServletContextListener
     * Spring példa: ApplicationEvent
     * 
     */
    @Test
    public void testObserver(){
        Employee employee = new Employee("John Doe", 1000);
        Office office = new Office();
        employee.register(office);

        employee.setName("Jack Doe");

        assertThat(office.getChanges(), equalTo(Arrays.asList("John Doe -> Jack Doe")));

        employee.remove(office);

        employee.setName("John Doe");

        assertThat(office.getChanges().size(), equalTo(1));
    }
}
