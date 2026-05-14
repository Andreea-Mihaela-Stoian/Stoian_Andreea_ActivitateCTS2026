package cts.ase.ro.design;

public class Jucator {

    private String username;

    private int nivelCont;

    //generate constructor
    public Jucator(String username, int nivelCont) {
        this.username = username;
        this.nivelCont = nivelCont;
    }

    // generate getter pt atribute
    public String getUsername() {
        return username;
    }

    public int getNivelCont() {
        return nivelCont;
    }
}