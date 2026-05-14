package cts.ase.ro.design;

public class ClientCinema {
    private String nume;
    private int varsta;
    private int nrBilete;

    public ClientCinema(String nume, int varsta, int nrBilete) {
        this.nume = nume;
        this.varsta = varsta;
        this.nrBilete = nrBilete;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientCinema{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", nrBilete=").append(nrBilete);
        sb.append('}');
        return sb.toString();
    }

    // verifica daca poate cumpara mai multe bilete
    public boolean verificareBilete() {
        return nrBilete > 1;
    }
}
