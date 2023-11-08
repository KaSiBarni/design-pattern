package org.telekom.designpatterns.singleton;


import org.telekom.designpatterns.intro.composition.Employee;

import java.util.ArrayList;
import java.util.List;

//Adatábzisba be és ki olvasás
public class EmployeeDao {

    //Itt is példányosithatjuk adhatunk nekki értéket new EmployeeDao();
    //Vagy private constructor hogy ne lehessen példányositani
    private static EmployeeDao employeeDao;

    public static synchronized EmployeeDao getInstance(){
        if (employeeDao == null) {
            employeeDao=new EmployeeDao();
        }
        return employeeDao;
    }

    private EmployeeDao(){

    }
    public List<Employee> listEmployee(){
        return new ArrayList<>();
    }

    public void saveEmployee(Employee employee){
        // jdbc employe entitás mentés jön ide ...
    }
}
