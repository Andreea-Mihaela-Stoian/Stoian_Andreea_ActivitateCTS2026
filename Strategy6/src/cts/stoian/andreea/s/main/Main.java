package cts.stoian.andreea.s.main;

import cts.stoian.andreea.s.strategy.Utilizator;
import cts.stoian.andreea.s.strategy.VizualizarePretCrescator;
import cts.stoian.andreea.s.strategy.VizualizareProduseCuRecenzii;

public class Main {
    public static void main(String[] args) {

        // creare utilizator
        Utilizator utilizator = new Utilizator("Andreea");

        // setare strategie crescatoare + apel strategie
        utilizator.setStrategieVizualizare(new VizualizarePretCrescator());
        utilizator.vizualizeazaProduse();

        // schimbare strategie descrescatoare
        utilizator.setStrategieVizualizare(new VizualizarePretCrescator());
        utilizator.vizualizeazaProduse();

        // schimbare strategie recenzii
        utilizator.setStrategieVizualizare(new VizualizareProduseCuRecenzii());
        utilizator.vizualizeazaProduse();
    }
}
/*
Am ales Strategy deoarece cerinta presupune mai multe tehnici de vizualizare pentru aceeasi lista de produse.

Utilizatorul poate schimba metoda de afisare, iar in timp se pot adauga noi strategii.
*/