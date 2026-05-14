package cts.ase.ro.design;

public class Comanda {

    private String produs;
    private int cantitate;

    public Comanda(String produs, int cantitate) {
        this.produs = produs;
        this.cantitate = cantitate;
    }

    // verifica daca comanda este valida
    public void verificareComanda() {

        if (cantitate > 0) {
            System.out.println("Comanda valida pentru produsul: " + produs);
        } else {
            System.out.println("Comanda invalida!");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comanda{");
        sb.append("produs='").append(produs).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
