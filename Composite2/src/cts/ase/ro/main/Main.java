package cts.ase.ro.main;

import cts.ase.ro.design.Categorie;
import cts.ase.ro.design.Produs;
import cts.ase.ro.design.StructuraMagazin;

public class Main {
    public static void main(String[] args) {
        // categorii
        Categorie electronice = new Categorie("Electronice");
        Categorie telefoane = new Categorie("Telefoane");
        Categorie laptopuri = new Categorie("Laptopuri");

        Categorie accesorii = new Categorie("Accesorii");

        // produse
        StructuraMagazin p1 = new Produs("iPhone 15", 6500);
        StructuraMagazin p2 = new Produs("Samsung S24", 5500);
        StructuraMagazin p3 = new Produs("MacBook Air", 8000);
        StructuraMagazin p4 = new Produs("Husa telefon", 50);

        // construire structura
        electronice.adaugaNod(telefoane);
        electronice.adaugaNod(laptopuri);

        telefoane.adaugaNod(p1);
        telefoane.adaugaNod(p2);

        laptopuri.adaugaNod(p3);

        electronice.adaugaNod(accesorii);
        accesorii.adaugaNod(p4);

        // afisare ierarhie
        electronice.descriere("");
    }
}
