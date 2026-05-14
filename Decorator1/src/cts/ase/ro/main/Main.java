package cts.ase.ro.main;

import cts.ase.ro.clase.ContJoc;
import cts.ase.ro.decorator.ContJocDecorat;
import cts.ase.ro.decorator.DecoratorCont;

public class Main {
    public static void main(String[] args) {

        // obiect initial
        ContJoc cont = new ContJoc("Andreea", 1500);

        cont.afisareCont();

        System.out.println("----------------");

        // obiect decorat
        DecoratorCont contDecorat = new ContJocDecorat(cont);

        // aplicare bonus
        contDecorat.acordaBonus(500);

        // apel dupa decorare
        contDecorat.afisareCont();
    }
}
