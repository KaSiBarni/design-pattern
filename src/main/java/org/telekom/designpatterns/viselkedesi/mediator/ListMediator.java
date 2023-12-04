package org.telekom.designpatterns.viselkedesi.mediator;

import java.util.List;

public class ListMediator {

    private List<String> from;

    private List<String> to;

    public ListMediator(List<String> from, List<String> to) {
        this.from = from;
        this.to = to;
    }

    public void add (String s){
        from.remove(s);
        to.add(s);
        to.sort(String::compareTo);
    }

    public void addAll(){
        to.addAll(from);
        from.clear();
        to.sort(String::compareTo);
    }

    public void remove(String s){
        to.remove(s);
        from.add(s);
        from.sort(String::compareTo);
    }

    public void removeAll(){
        from.addAll(to);
        to.clear();
        from.sort(String::compareTo);
    }

    public List<String> getFrom() {
        return from;
    }

    public List<String> getTo() {
        return to;
    }
}
