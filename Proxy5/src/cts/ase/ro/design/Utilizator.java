package cts.ase.ro.design;

public class Utilizator {
    private String nume;
    private boolean abonamentPremium;

    public Utilizator(String nume, boolean abonamentPremium) {
        this.nume = nume;
        this.abonamentPremium = abonamentPremium;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAbonamentPremium() {
        return abonamentPremium;
    }
}
