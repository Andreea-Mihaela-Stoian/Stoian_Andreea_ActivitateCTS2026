package cts.ase.ro.design;

public class Utilizator {
    private String username;
    private int varsta;

    //generate constructor
    public Utilizator(String username, int varsta) {
        this.username = username;
        this.varsta = varsta;
    }

    //generate getter pt atribute
    public String getUsername() {
        return username;
    }

    public int getVarsta() {
        return varsta;
    }
}
