package cts.ase.ro.design;

public class Film implements IAccesFilm{
    private String numeFilm;
    private int ratingVarsta;

    //obiectul utilizator
    private Utilizator utilizator;

    //generate constructor
    public Film(String numeFilm, int ratingVarsta, Utilizator utilizator) {
        this.numeFilm = numeFilm;
        this.ratingVarsta = ratingVarsta;
        this.utilizator = utilizator;
    }

    //generate getter pt atribute
    public String getNumeFilm() {
        return numeFilm;
    }

    public int getRatingVarsta() {
        return ratingVarsta;
    }

    public Utilizator getUtilizator() {
        return utilizator;
    }

    @Override
    public void ruleazaFilm() {
        System.out.println("Film pornit: " + numeFilm);
    }
}
