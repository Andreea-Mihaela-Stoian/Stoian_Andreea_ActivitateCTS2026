package cts.ase.ro.main;

import cts.ase.ro.design.BlackFriday;
import cts.ase.ro.design.CosCumparaturi;
import cts.ase.ro.design.Fidelitate;
import cts.ase.ro.design.Student;

public class Main {
    public static void main(String[] args) {

        CosCumparaturi cosCumparaturi = new CosCumparaturi("Andreea");

        cosCumparaturi.setStrategieReducere(new Student());
        cosCumparaturi.calculeazaPret(100);

        cosCumparaturi.setStrategieReducere(new BlackFriday());
        cosCumparaturi.calculeazaPret(100);

        cosCumparaturi.setStrategieReducere(new Fidelitate());
        cosCumparaturi.calculeazaPret(100);
    }
}
