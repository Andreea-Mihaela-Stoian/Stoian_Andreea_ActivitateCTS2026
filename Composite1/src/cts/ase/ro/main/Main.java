package cts.ase.ro.main;

import cts.ase.ro.design.Departament;
import cts.ase.ro.design.Specializare;
import cts.ase.ro.design.StructuraUniversitate;

public class Main {
    public static void main(String[] args) {
        // departamente (composite)
        Departament facultate = new Departament("Facultatea de Informatica");
        Departament departamentSoftware = new Departament("Software");
        Departament departamentAI = new Departament("Inteligenta Artificiala");
        Departament departamentSecuritate = new Departament("Securitate Cibernetica");

        // specializari (leaf)
        StructuraUniversitate s1 = new Specializare("Java Developer");
        StructuraUniversitate s2 = new Specializare("Web Developer");
        StructuraUniversitate s3 = new Specializare("Machine Learning");
        StructuraUniversitate s4 = new Specializare("Cyber Security");

        // construire structura ierarhica
        facultate.adaugaNod(departamentSoftware);
        facultate.adaugaNod(departamentAI);

        departamentSoftware.adaugaNod(s1);
        departamentSoftware.adaugaNod(s2);

        departamentAI.adaugaNod(s3);
        departamentAI.adaugaNod(departamentSecuritate);

        departamentSecuritate.adaugaNod(s4);

        // afisare structura
        facultate.descriere("");
    }
}
