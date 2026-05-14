package cts.ase.ro.design;

public class Client {

    private String nume;
    private int puncteFidelitate;
    private int varsta;

    //generate constructor
    public Client(String nume, int puncteFidelitate, int varsta) {
        this.nume = nume;
        this.puncteFidelitate = puncteFidelitate;
        this.varsta = varsta;
    }

    // verifica daca clientul primeste reducere
    public boolean verificareReducere() {
        return puncteFidelitate > 100;
    }

    //generate toString()
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", puncteFidelitate=").append(puncteFidelitate);
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
