package cts.ase.ro.clase;

public class Abonament implements IAbonament{
    private String numeUtilizator;
    private double pret;

    // constructor generate
    public Abonament(String numeUtilizator, double pret) {
        this.numeUtilizator = numeUtilizator;
        this.pret = pret;
    }

    // metoda de baza
    @Override
    public void afisareAbonament() {
        System.out.println("Abonamentul utilizatorului " + numeUtilizator + " costa " + pret + " lei.");
    }

    // getters & setters generate
    public String getNumeUtilizator() {
        return numeUtilizator;
    }

    public void setNumeUtilizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}
