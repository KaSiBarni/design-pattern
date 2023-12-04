package org.telekom.designpatterns.letrehozasi.simplefactory;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PayDetailsFactoryTest {

    /**
     * Nem Gang Of 4 tervezési minta
     * Azonos típusó de eltérő osztályú objektumok példányosítása valamely feltétel alapján
     * A példányosítása a simple factory felelőssége, független a használótól.
     * A használó nem tudja hgy kell a példányosítást elvégezni és mely dinamikus típusú példányt kap vissza
     * Tévhittel ellentétben nincs Factory tervezési minta
     *
     *
     * -- Simple Factory következmények
     *
     * Methódus törzsében következmények
     * Új osztály bevezetésekor bővíteni kell
     */

    @Test
    public void create_Hourly_Test(){
        PayDetails payDetails = new PayDetailsFactory().create("H;1000;50");
        assertThat(payDetails.getClass(), equalTo(HourlyPayDetails.class));
        assertThat(((HourlyPayDetails) payDetails).getBase(), equalTo(1000d));
        assertThat(((HourlyPayDetails) payDetails).getHours(), equalTo(50));
    }

    @Test
    public void create_Monthly_Test(){
        PayDetails payDetails = new PayDetailsFactory().create("M;100000");
        assertThat(payDetails.getClass(), equalTo(MonthlyPayDetails.class));
        assertThat(((MonthlyPayDetails) payDetails).getMonthlyAmount(), equalTo(100000d));
    }
}
