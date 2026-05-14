package cts.ase.ro.chain;

import cts.ase.ro.observer.Utilizator;

public class NotificatorAplicatie extends Notificator{
    @Override
    public void notifica(Utilizator utilizator, String mesaj) {
        if (utilizator.getUsernameAplicatie() != null) {
            utilizator.primesteNotificareAplicatie(mesaj);
        } else {
            super.getSuccesor().notifica(utilizator, mesaj);
        }
    }
}
