package cts.ase.ro.main;

import cts.ase.ro.design.*;

public class Main {
    public static void main(String[] args) {

        // receiver 1 - misiune principala
        MisiuneJoc misiune1 = new MisiunePrincipala(101);

        // invoker
        Operator operator = new Operator();

        // comenzi misiune principala
        Command pornire1 = new ComandaPornire(misiune1);

        Command abandonare1 = new ComandaAbandonare(misiune1);

        // apel comenzi principala
        operator.invoca(pornire1);
        operator.invoca(abandonare1);

        System.out.println("----------------");

        // receiver 2 - misiune secundara
        MisiuneJoc misiune2 = new MisiuneSecundara(202);

        // comenzi misiune secundara
        Command pornire2 = new ComandaPornire(misiune2);

        Command abandonare2 = new ComandaAbandonare(misiune2);

        // apel comenzi secundara
        operator.invoca(pornire2);
        operator.invoca(abandonare2);
    }
}
