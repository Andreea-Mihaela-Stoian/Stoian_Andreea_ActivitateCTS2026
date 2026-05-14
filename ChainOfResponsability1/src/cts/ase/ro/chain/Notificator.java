package cts.ase.ro.chain;

import cts.ase.ro.observer.Utilizator;

public abstract class Notificator {
    private Notificator succesor;

    public Notificator getSuccesor() {
        return succesor;
    }

    public void setSuccesor(Notificator succesor) {
        this.succesor = succesor;
    }

    // metoda abstracta pentru trimiterea notificarii
    public abstract void notifica(Utilizator utilizator, String mesaj);
}