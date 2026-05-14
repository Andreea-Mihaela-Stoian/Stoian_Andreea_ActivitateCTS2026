package cts.ase.ro.main;

import cts.ase.ro.design.ClientRezervare;
import cts.ase.ro.design.Ghiseu;
import cts.ase.ro.design.Online;
import cts.ase.ro.design.Telefon;

public class Main {
    public static void main(String[] args) {

        ClientRezervare clientRezervare = new ClientRezervare("Andreea");

        clientRezervare.setStrategieRezervare(new Online());
        clientRezervare.rezerva(2);

        clientRezervare.setStrategieRezervare(new Ghiseu());
        clientRezervare.rezerva(4);

        clientRezervare.setStrategieRezervare(new Telefon());
        clientRezervare.rezerva(1);
    }
}
