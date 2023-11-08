package org.telekom.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Unit implements Node{

    private String name;

    private List<Node> children = new ArrayList<>();

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Node> getChildren() {
        return children;
    }


}
