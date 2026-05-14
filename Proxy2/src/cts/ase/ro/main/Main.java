package cts.ase.ro.main;

import cts.ase.ro.design.JocOnline;
import cts.ase.ro.design.Jucator;
import cts.ase.ro.design.ProxyJoc;

public class Main {
    public static void main(String[] args) {

        // creare jucator
        Jucator j1 = new Jucator("Andreea", 8);

        // creare joc (obiect real)
        JocOnline joc = new JocOnline("Battle Arena", 5, "EU-West", j1);

        // acces prin proxy
        ProxyJoc proxy = new ProxyJoc(joc);

        proxy.intraInJoc();
    }
}
