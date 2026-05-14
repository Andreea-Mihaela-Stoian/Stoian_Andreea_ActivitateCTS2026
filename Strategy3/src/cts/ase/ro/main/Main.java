package cts.ase.ro.main;

import cts.ase.ro.design.Aplicatie;
import cts.ase.ro.design.Email;
import cts.ase.ro.design.Push;
import cts.ase.ro.design.SMS;

public class Main {
    public static void main(String[] args) {

        // cream aplicatia
        Aplicatie app = new Aplicatie("Andreea");

        // strategie EMAIL
        app.setStrategieNotificare(new Email());
        app.trimite("Salut!");

        // schimbam in SMS
        app.setStrategieNotificare(new SMS());
        app.trimite("Ai un cod nou!");

        // schimbam in PUSH
        app.setStrategieNotificare(new Push());
        app.trimite("Notificare importanta!");
    }
}
