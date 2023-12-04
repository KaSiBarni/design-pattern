package org.telekom.designpatterns.letrehozasi.prototype;

public interface PayDetails extends Cloneable {

    double pay();

    Object clone() throws CloneNotSupportedException;
}
