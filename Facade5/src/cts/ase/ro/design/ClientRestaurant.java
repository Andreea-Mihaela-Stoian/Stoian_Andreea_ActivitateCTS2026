package cts.ase.ro.design;

public class ClientRestaurant {
    private String nume;
    private int varsta;

    public ClientRestaurant(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // verifica daca clientul poate comanda alcool
    public boolean poateComanda() {
        return varsta >= 18;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientRestaurant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
