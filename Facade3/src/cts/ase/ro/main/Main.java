package cts.ase.ro.main;

import cts.ase.ro.design.BancaFacade;

public class Main {
    public static void main(String[] args) {
        BancaFacade facade = new BancaFacade();

        facade.procesareTranzactie("Andreea", 22, "RO12345",
                1000, "BCR", 300);
    }
}
