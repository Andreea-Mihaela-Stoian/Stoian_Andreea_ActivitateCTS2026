package cts.ase.ro.main;

import cts.ase.ro.design.Comanda;
import cts.ase.ro.design.Curier;
import cts.ase.ro.design.LivrareAuto;
import cts.ase.ro.design.LivrareScuter;

public class Main {
    public static void main(String[] args) {

        // cream comanda
        Comanda comanda = new Comanda("Andreea");

        // schimbam strategia dinamic (runtime)
        comanda.setStrategieLivrare(new Curier());
        comanda.proceseazaComanda("Bucuresti", 5);

        comanda.setStrategieLivrare(new LivrareAuto());
        comanda.proceseazaComanda("Cluj", 300);

        comanda.setStrategieLivrare(new LivrareScuter());
        comanda.proceseazaComanda("Sector 3", 2);
    }
}
