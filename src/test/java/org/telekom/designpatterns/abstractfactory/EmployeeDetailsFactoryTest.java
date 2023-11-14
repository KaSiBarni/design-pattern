package org.telekom.designpatterns.abstractfactory;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeDetailsFactoryTest {

    /**
     * Interfész család különböző implementációjának példányosítása
     *
     * Mint a Factory Method, csak objektum családot hoz létre
     * Factory Methodból nőhet ki
     *
     * -- TUlajdonságok
     * Új implementációc család könnyen bevezethető, eddigiek modosítása nélkül
     *
     * Család általában diszjunk halmazok
     *
     * Gyakran együtt a Bridge tervezési mintával
     *
     */
    @Test
    public void test_hourly(){
        EmployeeDetailsFactory factory = new HourlyEmployeeDetailsFactory();
        PayDetails payDetails = factory.createPayDetails();
        assertThat(payDetails.getClass(), equalTo(HourlyPayDetails.class));

        Bonus bonus = factory.createBonus();
        assertThat(bonus.getClass(), equalTo(HourlyBonus.class));
    }

    @Test
    public void test_monthly(){
        EmployeeDetailsFactory factory = new MonthlyEmployeeDetailsFactory();
        PayDetails payDetails = factory.createPayDetails();
        assertThat(payDetails.getClass(), equalTo(MonthlyPayDetails.class));

        Bonus bonus = factory.createBonus();
        assertThat(bonus.getClass(), equalTo(MonthlyBonus.class));
    }
}
