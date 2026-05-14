package cts.ase.ro.main;

import cts.ase.ro.observer.MagazinOnline;
import cts.ase.ro.observer.Utilizator;

public class Main {
    public static void main(String[] args) {
        MagazinOnline magazin = new MagazinOnline();

        Utilizator u1 = new Utilizator("Andreea", "andreea_app", "andreea@gmail.com");
        Utilizator u2 = new Utilizator("Mihai", null, "mihai@gmail.com");
        Utilizator u3 = new Utilizator("Ioana", null, null);

        magazin.adaugaObserver(u1);
        magazin.adaugaObserver(u2);
        magazin.adaugaObserver(u3);

        magazin.trimiteNotificare("Comanda ta a fost expediata.");
    }
}
