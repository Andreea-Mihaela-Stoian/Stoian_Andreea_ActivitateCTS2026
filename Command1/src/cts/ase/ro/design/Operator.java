package cts.ase.ro.design;

public class Operator {
    // invoca o comanda fara sa stie detaliile actiunii
    public void invoca(Command comanda) {
        comanda.executa();
    }
}
