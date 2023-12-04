package org.telekom.designpatterns.viselkedesi.mediator;

import org.junit.Test;
import org.telekom.designpatterns.viselkedesi.mediator.ListMediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ListMediatorTest {

    /**
     * Az objektumok egy csoportját vezérli úgy, hogy azok nem tudnak egymásról
     * Az objektumok között laza kapcsolat van, objektumok magukban is használhatóak
     * Függőségek számának csökkentése
     * Központosított vezérlés
     * HUB
     *
     * JDK példa: Executor
     *
     */
    @Test
    public void testAdd(){
        List<String> from = new ArrayList<>(Arrays.asList("Java", "JavaScript", "PHP", "Python"));
        List<String> to = new ArrayList<>();
        ListMediator listMediator = new ListMediator(from, to);

        listMediator.add("PHP");

        assertThat(listMediator.getFrom(), equalTo(Arrays.asList("Java", "JavaScript", "Python")));
        assertThat(listMediator.getTo(), equalTo(Arrays.asList("PHP")));
    }
}
