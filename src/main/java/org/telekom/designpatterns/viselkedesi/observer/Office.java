package org.telekom.designpatterns.viselkedesi.observer;

import java.util.ArrayList;
import java.util.List;

public class Office implements EmployeeObserver {

    private List<String> changes = new ArrayList<>();


    @Override
    public void nameHasChanged(String oldName, String newName) {
        changes.add(oldName + " -> " + newName);
    }

    public List<String> getChanges() {
        return changes;
    }
}
