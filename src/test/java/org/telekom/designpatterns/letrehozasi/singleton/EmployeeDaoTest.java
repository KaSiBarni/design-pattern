package org.telekom.designpatterns.letrehozasi.singleton;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeDaoTest {

    /**
     * Leginkább megosztó tervezési minta
     * Egy példány, és ahhoz közös hozzáférés
     * Klasszikus: privát konstruktor, statikus attributum
     * Lazy initialization
     * Párhuzamosság
     * Cluster
     *
     * GoF példa: egy nnyomtatóhoz csak egy nyomtatási sor
     * JDK példa: java.lang.Runtime#getRuntime()
     *
     * Tulajdonságok:
     * Effective Java szinet: enum
     *      - nincs probléma a párhozamossággal
     *      - nem lehet reflectionnel megkerülni
     *
     * Globális állapot
     * Nehezen tesztelhető
     * Single Responsibility Principle metörése, ugyanis felelős azért is hogy belőle egy példány lehessen
     *
     */

    @Test
    public void testGetInstance(){
        EmployeeDao employeeDao = EmployeeDao.getInstance();

        EmployeeDao another = EmployeeDao.getInstance();

        assertThat(employeeDao, equalTo(another));
    }
}
