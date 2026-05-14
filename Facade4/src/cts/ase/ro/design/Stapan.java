package cts.ase.ro.design;

public class Stapan {
    private String nume;
    private int varsta;

    public Stapan(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // verifica daca stapanul poate plati tratamentul
    public boolean verificarePlata() {
        return varsta > 18;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stapan{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
