package org.telekom.designpatterns.szerkezeti.composite;

import java.util.List;

public interface Node {

    String getName();

    List<Node> getChildren();
}
