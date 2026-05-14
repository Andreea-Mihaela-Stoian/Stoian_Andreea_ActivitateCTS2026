package cts.ase.ro.design;

public class ClientBanca {
    private String nume;
    private int pinCorect;

    //constructor
    public ClientBanca(String nume, int pinCorect) {
        this.nume = nume;
        this.pinCorect = pinCorect;
    }

    //getter pt atribute
    public String getNume() {
        return nume;
    }

    public int getPinCorect() {
        return pinCorect;
    }
}
