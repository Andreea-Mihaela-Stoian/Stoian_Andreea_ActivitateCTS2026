package cts.ase.ro.design;

public class Jucator {
    private String nume;

    // strategia curenta
    private ModJoc modJoc;

    // metoda care apeleaza strategia
    public void startJoc(int nivel) {
        modJoc.nivelDificultate(this.nume, nivel);
    }

    // constructor fara strategie
    // setam default EASY
    public Jucator(String nume) {
        this.nume = nume;
        this.modJoc = new Easy();
    }

   //generate constructor
    public Jucator(String nume, ModJoc modJoc) {
        this.nume = nume;
        this.modJoc = modJoc;
    }

    //generate getter
    public ModJoc getModJoc() {
        return modJoc;
    }

    //generate setter
    public void setModJoc(ModJoc modJoc) {
        this.modJoc = modJoc;
    }
}
