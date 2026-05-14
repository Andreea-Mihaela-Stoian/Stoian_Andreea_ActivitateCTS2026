package cts.ase.ro.main;

import cts.ase.ro.design.FlyweightJoc;
import cts.ase.ro.design.OptiuniGrafice;
import cts.ase.ro.design.PersonajJoc;

public class Main {
    public static void main(String[] args) {

        // optiuni diferite pentru fiecare masina
        OptiuniGrafice opt1 = new OptiuniGrafice(true, false, true, 70);

        OptiuniGrafice opt2 = new OptiuniGrafice(false, true, true, 100);

        OptiuniGrafice opt3 = new OptiuniGrafice(true, true, false, 40);

        // factory flyweight
        FlyweightJoc factory = new FlyweightJoc();

        System.out.println("------PERSONAJ 1------");

        // creare/reutilizare flyweight
        PersonajJoc personaj1 = factory.getPersonaj(1, "Shadow", "Asasin", "Katana");

        personaj1.descriere(opt1);
        personaj1.descriere(opt2);
        personaj1.descriere(opt3);

        System.out.println("------PERSONAJ 2------");

        // cod identic -> reutilizeaza obiectul existent
        PersonajJoc personaj2 = factory.getPersonaj(1, "TEST", "TEST", "TEST");

        personaj2.descriere(opt1);
        personaj2.descriere(opt2);

        System.out.println("------PERSONAJ 3------");

        // cod diferit -> obiect nou
        PersonajJoc personaj3 = factory.getPersonaj(5, "Hunter", "Arcas", "Arc");

        personaj3.descriere(opt1);
        personaj3.descriere(opt2);
        personaj3.descriere(opt3);
    }
}
