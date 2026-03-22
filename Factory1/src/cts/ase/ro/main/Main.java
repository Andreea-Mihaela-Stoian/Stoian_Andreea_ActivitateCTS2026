package cts.ase.ro.main;

import cts.ase.ro.clase.Brutarie;
import cts.ase.ro.clase.LinieProductie;
import cts.ase.ro.clase.TipProdus;

public class Main {
    public static void main(String[] args) {
        LinieProductie linie1 = LinieProductie.getInstance();
        Brutarie covrig = linie1.getBrutarie(TipProdus.Covrig, "alba");
        Brutarie cozonac = linie1.getBrutarie(TipProdus.Cozonac, "maia");

        // pt duplicat linie ctrl+d
        System.out.println(covrig.toString());
        System.out.println(cozonac.toString());
    }
}
