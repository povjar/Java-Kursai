package uzduotis13;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collection<Automobilis> list = new TreeSet<>();

        list.add(new Automobilis("abc123", "Audi", "Petras", "Petraitis"));
        list.add(new Automobilis("rfe456", "Skoda", "Ona", "Petraitiene"));
        list.add(new Automobilis("yyy975", "Bmw", "Algis", "Zukauskas"));
        list.add(new Automobilis("aht112", "Lada", "Jonas", "Andriulis"));
        list.add(new Automobilis("aht000", "Audi", "Jonas", "Petraitis"));

        for (Automobilis automobilis : list) {
            System.out.println(automobilis);
        }
    }
}
