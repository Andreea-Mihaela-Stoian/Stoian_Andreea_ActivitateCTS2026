package cts.ase.ro.main;

import cts.ase.ro.design.*;

public class Main {
    public static void main(String[] args) {

        // receiver 1 melodie rock
        Melodie melodie1 = new MelodieRock("Numb");

        // invoker-ul care executa comenzile
        ControllerMuzica controller = new ControllerMuzica();

        // comenzi melodie rock
        Command play = new ComandaPlay(melodie1);
        Command stop = new ComandaStop(melodie1);

        // apel comenzi rock
        controller.invoca(play);
        controller.invoca(stop);

        System.out.println("----------------");

        // receiver 2  melodie pop
        Melodie melodie2 = new MelodiePop("Blinding Lights");

        // comenzi melodie pop
        Command play2 = new ComandaPlay(melodie2);
        Command stop2 = new ComandaStop(melodie2);

        // apel comenzi pop
        controller.invoca(play2);
        controller.invoca(stop2);

    }
}
