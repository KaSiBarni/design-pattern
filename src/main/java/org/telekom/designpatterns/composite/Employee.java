package org.telekom.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Node{
    //levél elem mert önmagán bellül nem tárolhat több elemet

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Node> getChildren() {
        return new ArrayList<>();
    }
}
