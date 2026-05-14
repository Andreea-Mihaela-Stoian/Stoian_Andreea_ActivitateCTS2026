package cts.ase.ro.main;

import cts.ase.ro.design.Easy;
import cts.ase.ro.design.Hard;
import cts.ase.ro.design.Jucator;
import cts.ase.ro.design.Medium;

public class Main {
    public static void main(String[] args) {

        // cream jucator
        Jucator jucator = new Jucator("Andreea");

        // schimbam strategia in timpul executiei
        jucator.setModJoc(new Easy());
        jucator.startJoc(1);

        jucator.setModJoc(new Medium());
        jucator.startJoc(3);

        jucator.setModJoc(new Hard());
        jucator.startJoc(7);
    }
}
