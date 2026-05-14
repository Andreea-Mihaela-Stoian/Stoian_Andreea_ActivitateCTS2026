package cts.ase.ro.design;

public class ClientBanca {
    private String nume;
    private int varsta;

    public ClientBanca(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // verifica daca poate face operatiuni bancare
    public boolean esteMajor() {
        return varsta >= 18;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientBanca{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
