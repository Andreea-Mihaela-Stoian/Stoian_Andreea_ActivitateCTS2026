package cts.stoian.andreea.s.main;

import cts.stoian.andreea.s.composite.StructuraOMS;
import cts.stoian.andreea.s.composite.TulpinaVirus;
import cts.stoian.andreea.s.composite.ZonaOMS;

public class Main {
    public static void main(String[] args) throws Exception {

        // radacina arbore
        StructuraOMS glob = new ZonaOMS("Glob");

        // continente
        StructuraOMS europa = new ZonaOMS("Europa");
        StructuraOMS asia = new ZonaOMS("Asia");

        // tari
        StructuraOMS romania = new ZonaOMS("Romania");
        StructuraOMS germania = new ZonaOMS("Germania");
        StructuraOMS china = new ZonaOMS("China");

        // tulpini virus
        StructuraOMS virus1 = new TulpinaVirus("Beta", "ridicat", 1200);
        StructuraOMS virus2 = new TulpinaVirus("Delta", "mediu", 800);
        StructuraOMS virus3 = new TulpinaVirus("Alpha", "scazut", 300);

        // construire arbore
        glob.adaugaNod(europa);
        glob.adaugaNod(asia);

        europa.adaugaNod(romania);
        europa.adaugaNod(germania);
        asia.adaugaNod(china);

        romania.adaugaNod(virus1);
        germania.adaugaNod(virus2);
        china.adaugaNod(virus3);

        // afisare structura
        glob.descriere("");

        // afisare total cazuri
        System.out.println("Total cazuri: " + glob.getTotalCazuri());
    }
}
/*
 Am ales Composite deoarece cerinta presupune o structura arborescenta
 formata din continente,tari si tulpini de virusuri.

 Atat nodurile compuse, cat si frunzele sunt tratate prin aceeasi interfata.
 */