package org.telekom.designpatterns.prototype;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeTest {

    /**
     *
     * Az objektum létrehozás prototípus példány alapján
     * Pédány másolat, klón
     * Clone: deep, shallow
     * Copy konstruktor
     *
     * JDK példa: java.lang.Object#clone()
     * Java példa: Spring Framework prototype scope
     * Java eszközök: Apache Commons BeanUtils
     *
     * @throws CloneNotSupportedException
     */

    @Test
    public void test_clone() throws CloneNotSupportedException {
        Employee employee = new Employee("John Doe", new HourlyPayDetails(1000,50));
        Employee clonedEmployee = (Employee) employee.clone();

        assertThat(clonedEmployee.getName(), equalTo("John Doe"));
        assertThat(clonedEmployee.getPayDetails().pay(), equalTo(50000d));

        Employee thirdEmployee = (Employee) employee.clone();
        ((HourlyPayDetails) thirdEmployee.getPayDetails()).setBaseAmount(2000);

        // Változott az érték az előző clone értke is, mivel a HourlyPayDetails ugyan abbol az objektumból hivatkozik
        // Tehát mindegy melyik cloneon modositom igy mind a kettőőnél modosul mert ugyan azt használják
        // Shallow Copy működése
        // Immutableba lehet tenni igy nem lesz probléma a referenciába mert nem modositható
        // Vagy DEEPCOPY és cloneozzuk a HourlyPayDetails-t is.
        // PayDetailsba extendáljuk a Clonablet

        assertThat(clonedEmployee.getPayDetails().pay(), equalTo(50000d));
    }

    @Test
    public void test_copy_hourlyPayDetails_via_constructor(){
        HourlyPayDetails details = new HourlyPayDetails(1000,50);
        HourlyPayDetails anotherDetails = new HourlyPayDetails(details);

        assertThat(anotherDetails.getBaseAmount(), equalTo(1000d));
        assertThat(anotherDetails.getWorkHours(), equalTo(50));
    }
}
