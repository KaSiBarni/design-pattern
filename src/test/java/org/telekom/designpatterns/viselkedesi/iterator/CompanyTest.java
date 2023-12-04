package org.telekom.designpatterns.viselkedesi.iterator;

import org.junit.Test;
import org.telekom.designpatterns.viselkedesi.iterator.Company;
import org.telekom.designpatterns.viselkedesi.iterator.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CompanyTest {

    /**
     * Elemek elérésére szekvenciálisan
     * Collection bejáró módszer a collection típusának ismerete nélkül
     * Egyszerre több bejáró egy ceollectionon
     * bejárás közbeni modosítás ( csak az iterátorn)
     *
     * JDK példa: java.util.Iterator
     */

    @Test
    public void testIterator(){
        Company company = new Company();
        company.addEmployee(new Employee("John Doe"));
        company.addEmployee(new Employee("Jane Doe"));
        company.addEmployee(new Employee("Jack Doe"));

        List<String> names = new ArrayList<>();
        for (Employee employee : company) {
            names.add(employee.getName());
        }

        assertThat(names, equalTo(Arrays.asList("John Doe", "Jane Doe", "Jack Doe")));

//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add( new Employee( "John Doe"));
//        employeeList.add( new Employee( "Jack Doe"));
//        employeeList.add( new Employee( "Jane Doe"));
//
//        for (Employee employee: employeeList){
//            System.out.println(employee.getName());
//        }
//     Innentől nem kell tudni milyen collectiont használunk
//     De akár foreach is mehetne
//        Iterator<Employee> i = employeeList.iterator();
//        while (i.hasNext()){
//            Employee employee = i.next();
//            if (employee.getName().startsWith("John")){
//                i.remove();
//            }
//
//            System.out.println(employee.getName());
//        }
//
//        System.out.println(employeeList);

    }
}
