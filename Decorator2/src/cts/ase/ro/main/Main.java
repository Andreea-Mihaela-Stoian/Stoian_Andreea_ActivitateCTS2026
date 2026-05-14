package cts.ase.ro.main;

import cts.ase.ro.clase.Abonament;
import cts.ase.ro.decorator.AbonamentDecorat;
import cts.ase.ro.decorator.DecoratorAbonament;

public class Main {
    public static void main(String[] args) {

        // obiect initial
        Abonament abonament1 = new Abonament("Andreea", 80);
        abonament1.afisareAbonament();

        Abonament abonament2 = new Abonament("Mihai", 120);
        abonament2.afisareAbonament();

        System.out.println("----------------");

        // obiect decorat
        DecoratorAbonament abonamentDecorat1 = new AbonamentDecorat(abonament1);
        DecoratorAbonament abonamentDecorat2 = new AbonamentDecorat(abonament2);

        // aplicare reducere
        abonamentDecorat1.aplicaReducere(25);
        abonamentDecorat2.aplicaReducere(10);

        // apel dupa decorare
        abonamentDecorat1.afisareAbonament();

        System.out.println("----------------");

        abonamentDecorat2.afisareAbonament();
    }
}
