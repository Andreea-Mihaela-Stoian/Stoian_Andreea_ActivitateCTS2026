package cts.ase.ro.main;

import cts.ase.ro.design.*;

public class Main {
    public static void main(String[] args) {

        // receiver-ul pe care se executa actiunile
        MisiuneJoc misiune = new MisiunePrincipala(101);

        // invoker-ul care executa comenzile
        Operator operator = new Operator();

        // comenzi concrete
        Command pornire = new ComandaPornire(misiune);
        Command abandonare = new ComandaAbandonare(misiune);

        // apel comenzi prin operator
        operator.invoca(pornire);
        operator.invoca(abandonare);
    }
}
