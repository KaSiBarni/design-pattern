package org.telekom.designpatterns.abstractfactory;

public interface EmployeeDetailsFactory {

    PayDetails createPayDetails();

    Bonus createBonus();
}
