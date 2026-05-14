package cts.ase.ro.main;

import cts.ase.ro.design.FlyweightMasina;
import cts.ase.ro.design.MasinaCursa;
import cts.ase.ro.design.OptiuniMasina;

public class Main {
    public static void main(String[] args) {

        //optiuni diferite pentru fiecare masina
        OptiuniMasina opt1 = new OptiuniMasina(true, "Soft", 80);

        OptiuniMasina opt2 = new OptiuniMasina(false, "Medium", 40);

        OptiuniMasina opt3 = new OptiuniMasina(true, "Hard", 100);

        // flyweight
        FlyweightMasina flyweight = new FlyweightMasina();

        System.out.println("------MASINA 1------");

        // creare/reutilizare masina
        MasinaCursa masinaCursa1 = flyweight.getMasina(1, "GT-R", "Nissan", 320);

        masinaCursa1.descriere(opt1);
        masinaCursa1.descriere(opt2);
        masinaCursa1.descriere(opt3);

        System.out.println("------MASINA 2------");

        // cod identic -> reutilizare obiect
        MasinaCursa masinaCursa2 = flyweight.getMasina(1, "TEST", "TEST", 0);

        masinaCursa2.descriere(opt1);
        masinaCursa2.descriere(opt2);

        System.out.println("------MASINA 3------");

        // cod diferit -> obiect nou
        MasinaCursa masinaCursa3 = flyweight.getMasina(5, "Supra", "Toyota", 290);

        masinaCursa3.descriere(opt1);
        masinaCursa3.descriere(opt2);
        masinaCursa3.descriere(opt3);
    }
}
