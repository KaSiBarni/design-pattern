package org.telekom.designpatterns.prototype;

public interface PayDetails extends Cloneable {

    double pay();

    Object clone() throws CloneNotSupportedException;
}
