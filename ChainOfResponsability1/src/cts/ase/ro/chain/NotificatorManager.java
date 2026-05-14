package cts.ase.ro.chain;

import cts.ase.ro.observer.Utilizator;

public class NotificatorManager extends Notificator{
    @Override
    public void notifica(Utilizator utilizator, String mesaj) {
        System.out.println("Nu avem date de contact pentru utilizatorul " + utilizator.getNume());
    }
}
