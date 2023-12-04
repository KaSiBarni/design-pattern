package org.telekom.designpatterns.letrehozasi.abstractfactory;

public interface EmployeeDetailsFactory {

    PayDetails createPayDetails();

    Bonus createBonus();
}
