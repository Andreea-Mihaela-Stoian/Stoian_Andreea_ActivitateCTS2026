package cts.ase.ro.main;

import cts.ase.ro.Rezervare;
import cts.ase.ro.clase.RezervareAbstract;
import cts.ase.ro.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare("Andreea", 10, 12, 550.5f, true);
        System.out.println(rezervare1);

        Rezervare rezervare4 = new Rezervare();
        System.out.println(rezervare4);

        RezervareAbstract builder = new RezervareBuilder();
        Rezervare rezervare2 = builder.setNume("Mihaela").build();
        Rezervare rezervare3 = new RezervareBuilder().setNume("Ion").build();

        System.out.println(rezervare2);
        System.out.println(rezervare3);
    }
}
