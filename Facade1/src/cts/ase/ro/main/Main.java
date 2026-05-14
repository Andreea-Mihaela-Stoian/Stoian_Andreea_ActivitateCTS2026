package cts.ase.ro.main;

import cts.ase.ro.design.MagazinFacade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // cream facade (punctul unic de acces)
        MagazinFacade facade = new MagazinFacade();

        // lista produse disponibile
        List<Integer> disponibile = new ArrayList<>();
        disponibile.add(1);
        disponibile.add(2);
        disponibile.add(3);

        // lista produse deja vandute
        List<Integer> vandute = new ArrayList<>();
        vandute.add(10);

        // apel simplificat (nu mai vezi logica interna)
        facade.procesareComanda(
                "Andreea", 150, 22,
                "Ion", 5,
                "Laptop",
                disponibile,
                vandute,
                2
        );
    }
}
