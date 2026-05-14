package cts.ase.ro.design;

public class ControllerMuzica {
    // invoca o comanda fara sa stie logica interna
    public void invoca(Command comanda) {
        comanda.executa();
    }
}
