package cts.ase.ro.design;

public class CosCumparaturi {
    private String client;

    //strategia curenta
    private StrategieReducere strategieReducere;

    // constructor default
    public CosCumparaturi(String client) {
        this.client = client;
        this.strategieReducere = new Fidelitate();
    }

    //generate constructor
    public CosCumparaturi(String client, StrategieReducere strategieReducere) {
        this.client = client;
        this.strategieReducere = strategieReducere;
    }

    //generate getter
    public StrategieReducere getStrategieReducere() {
        return strategieReducere;
    }

    //generate setter
    public void setStrategieReducere(StrategieReducere strategieReducere) {
        this.strategieReducere = strategieReducere;
    }

    //metoda apel strategie
    public void calculeazaPret(double pret) {
        double finalPret = strategieReducere.aplicaReducere(pret);
        System.out.println(client + " plateste final: " + finalPret);
    }
}

