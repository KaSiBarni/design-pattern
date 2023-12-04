package org.telekom.designpatterns.szerkezeti.flyweight;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MonthlyPayDetailsTest {

    /**
     * Nagy mennyiségű objektum helyett néhány
     * Több kliens ugyanazt oszthetja meg
     * Tipikusan Factory Method vagy Abstract Factory használhatásval
     * Immutable / változhatatlan-állandó /
     *
     * Gof példa: betűk egy szövegszerkesztőben
     * JDK példa: String, Integer
     */
    @Test
    public void testGetInstance(){
        MonthlyPayDetails details = MonthlyPayDetails.getInstance(100);
        assertThat(details.pay(), equalTo(100d));

        MonthlyPayDetails another = MonthlyPayDetails.getInstance(100);
        assertThat(another.pay(), equalTo(100d));

        assertThat(details == another, equalTo(true));
    }
}
