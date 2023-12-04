package org.telekom.designpatterns.letrehozasi.simplefactory;

public class PayDetailsFactory {


    //M;100000
    //H;1000;50
    public PayDetails create(String s){
        if (s.startsWith("M")){
            String[] parts = s.split(";");
            return new MonthlyPayDetails(Double.parseDouble(parts[1]));
        } else if (s.startsWith("H")) {
            String[] parts = s.split(";");
            return new HourlyPayDetails(Double.parseDouble(parts[1]), Integer.parseInt(parts[2]));
        } else {
            throw new IllegalArgumentException("Invalid prefix");
        }
    }
}
