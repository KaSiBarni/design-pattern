package org.telekom.designpatterns.qg;

import org.junit.Test;

public class EmployeeBuilderTest {

    @Test
    public void testMyBuilder(){

        Employee employee = new EmployeeBuilder()
                .setName("Barni")
                .setAge(24)
                .setPosition("Software Engeneer")
                .build();

        System.out.println("name:" + employee.getName());
        System.out.println("age:" + employee.getAge());
        System.out.println("pos:" + employee.getPosition());

        System.out.println("Hello world!");
    }
}
