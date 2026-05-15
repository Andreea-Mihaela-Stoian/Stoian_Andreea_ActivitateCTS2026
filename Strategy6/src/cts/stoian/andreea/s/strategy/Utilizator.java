package cts.stoian.andreea.s.strategy;

public class Utilizator {
    private String nume;
    //strategia curenta de vizualizare
    private IProdus strategieVizualizare;

    //gconstructor fara strategie ( poti alege strategia mai tarziu)
    public Utilizator(String nume) {
        this.nume = nume;
    }

    //constructor cu strategia initiala
    public Utilizator(String nume, IProdus strategieVizualizare) {
        this.nume = nume;
        this.strategieVizualizare = strategieVizualizare;
    }

    //metoda de apel a strategiei
    public void vizualizeazaProduse() {
        strategieVizualizare.afiseazaProduse(this);
    }

    public String getNume() {
        return nume;
    }

    public IProdus getStrategieVizualizare() {
        return strategieVizualizare;
    }

    // setter schimbare strategie
    public void setStrategieVizualizare(IProdus strategieVizualizare) {
        this.strategieVizualizare = strategieVizualizare;
    }
}
