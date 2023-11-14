package org.telekom.designpatterns.flyweight;

import org.junit.Test;

public class StringTest {

    @Test
    public void testStringEquals(){
        String s = "a1";
        String s2 = "a1";

        System.out.println(s == s2);

        /*
         True értéket ad vissza, azaz az s és az s2 ugyan arra za objektumra mutat
         Java tervezői rájöttek a memóriában sok helyet foglalnak el,
         ezért ha literálokat hozunk létre, ha előszőr létrehozzuk akkor elmenti de,
         ha 2.jára létrehozza ugyan azt és az s2 referenciáját ugyan arra állítja be.

        */

        String a = new String("a1");
        String a2 = new String("a2");

        System.out.println(a == a2);

        // így már helyesen fog működni mivel 2 teljesen más objektumról van szó

        //Ugyan ez működik INtegerrel is amíg az érték alacsony.
    }
}
