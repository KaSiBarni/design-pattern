package org.telekom.designpatterns.szerkezeti.adapter;

import java.util.List;

public interface TableModel {

    List<String> getColumns();

    int getRowCount();

    String getValue(int row, int column);
}
