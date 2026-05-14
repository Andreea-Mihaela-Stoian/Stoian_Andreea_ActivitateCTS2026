package cts.ase.ro.main;

import cts.ase.ro.design.CabinetVetFacade;
import cts.ase.ro.design.CabinetVetFacade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CabinetVetFacade facade = new CabinetVetFacade();

        List<Integer> sanatoase = new ArrayList<>();
        sanatoase.add(1);
        sanatoase.add(2);

        List<Integer> bolnave = new ArrayList<>();
        bolnave.add(10);

        facade.procesareConsult("Rex", sanatoase, bolnave, "Andreea", 25,
                "Dr. Pop", 10, 1);
    }
}
