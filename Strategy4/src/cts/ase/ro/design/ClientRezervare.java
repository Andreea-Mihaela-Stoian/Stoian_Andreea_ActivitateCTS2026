package cts.ase.ro.design;

public class ClientRezervare {
    private String nume;

    //strategia curenta
    private StrategieRezervare strategieRezervare;

    public ClientRezervare(String nume, StrategieRezervare strategieRezervare) {
        this.nume = nume;
        this.strategieRezervare = strategieRezervare;
    }

    // constructor default
    public ClientRezervare(String nume) {
        this.nume = nume;
        this.strategieRezervare = new Online();
    }

    //generate getter
    public StrategieRezervare getStrategieRezervare() {
        return strategieRezervare;
    }

    //generate setter
    public void setStrategieRezervare(StrategieRezervare strategieRezervare) {
        this.strategieRezervare = strategieRezervare;
    }

    //metoda apel strategie
    public void rezerva(int locuri) {
        strategieRezervare.rezerva(nume, locuri);
    }
}
