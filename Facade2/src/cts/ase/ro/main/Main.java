package cts.ase.ro.main;

import cts.ase.ro.design.CinemaFacade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CinemaFacade facade = new CinemaFacade();

        List<Integer> libere = new ArrayList<>();
        libere.add(1);
        libere.add(2);
        libere.add(3);

        List<Integer> ocupate = new ArrayList<>();
        ocupate.add(10);

        facade.procesareBilet("Andreea", 22, 2, "Ion", 5, "Sala 1", libere, ocupate, 2);
    }
}
