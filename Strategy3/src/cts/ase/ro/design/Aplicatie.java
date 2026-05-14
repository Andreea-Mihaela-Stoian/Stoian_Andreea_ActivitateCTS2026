package cts.ase.ro.design;

public class Aplicatie {
    private String numeUser;

    //strategia curenta
    private StrategieNotificare strategieNotificare;

    //generate constructor
    public Aplicatie(String numeUser, StrategieNotificare strategieNotificare) {
        this.numeUser = numeUser;
        this.strategieNotificare = strategieNotificare;
    }

    //constructor cu strategia default = email
    public Aplicatie(String numeUser) {
        this.numeUser = numeUser;
        this.strategieNotificare = new Email();
    }

    //generate getter si setter pt strategie
    public StrategieNotificare getStrategieNotificare() {
        return strategieNotificare;
    }

    public void setStrategieNotificare(StrategieNotificare strategieNotificare) {
        this.strategieNotificare = strategieNotificare;
    }

    //metoda apel strategie
    public void trimite(String mesaj) {
        strategieNotificare.trimiteNotificare(numeUser, mesaj);
    }
}
