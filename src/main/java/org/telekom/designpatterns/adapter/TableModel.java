package org.telekom.designpatterns.adapter;

import java.util.List;

public interface TableModel {

    List<String> getColumns();

    int getRowCount();

    String getValue(int row, int column);
}
