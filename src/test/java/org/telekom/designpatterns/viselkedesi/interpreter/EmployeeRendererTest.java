package org.telekom.designpatterns.viselkedesi.interpreter;

import org.junit.Test;
import org.telekom.designpatterns.viselkedesi.interpreter.Employee;
import org.telekom.designpatterns.viselkedesi.interpreter.EmployeeRenderer;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeRendererTest {

    /**
     * Értelmezhető nyelv
     * Szintakszisfa felépítése
     * Futtatható objektumok létrehozása a szabály alapján- parser
     *
     * JDK példa: java.util.Pattern
     * Java EE példa: javax.el.ELResolver
     * Spring példa: Spring Expression Language
     *
     */

    @Test
    public void testRender(){

        EmployeeRenderer renderer = new EmployeeRenderer();
        String result = renderer.render(Arrays.asList(
                new Employee("John Doe"),
                new Employee("Jane Doe")
        ));

        assertThat(result, equalTo("<ul><li><span>John Doe</li><li><span>Jane Doe</li></ul>"));
    }
}
