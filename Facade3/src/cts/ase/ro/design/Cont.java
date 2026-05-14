package cts.ase.ro.design;

public class Cont {
    private String numarCont;
    private double sold;

    public Cont(String numarCont, double sold) {
        this.numarCont = numarCont;
        this.sold = sold;
    }

    // verifica daca se poate retrage suma
    public void verificareRetragere(double suma) {

        if (sold >= suma) {
            sold = sold - suma;
            System.out.println("Retragere aprobata. Sold ramas: " + sold);
        } else {
            System.out.println("Fonduri insuficiente!");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("numarCont='").append(numarCont).append('\'');
        sb.append(", sold=").append(sold);
        sb.append('}');
        return sb.toString();
    }
}
