package org.telekom.designpatterns.composite;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SearchTest {

    @Test
    public void testSearch(){

        Unit unit = new Unit("Organization");

        Unit depA = new Unit("a dep");
        Unit depB = new Unit("b dep");

        unit.getChildren().add(depA);
        unit.getChildren().add(depB);

        Unit teamA = new Unit("a team");
        Unit teamB = new Unit("b team");

        depA.getChildren().add(teamA);
        depA.getChildren().add(teamB);

        Employee emp1 = new Employee("John Doe");
        Employee emp2 = new Employee("a Doe");

        teamA.getChildren().add(emp1);
        teamA.getChildren().add(emp2);

        List<String> names = new ArrayList<>();
        new Search().find(names, unit);
        System.out.println(names);
        assertThat(names.size(), equalTo(3));
    }
}
