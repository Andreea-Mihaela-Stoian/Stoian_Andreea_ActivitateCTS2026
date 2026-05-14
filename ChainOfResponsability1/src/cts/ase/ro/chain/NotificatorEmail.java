package cts.ase.ro.chain;

import cts.ase.ro.observer.Utilizator;

public class NotificatorEmail extends Notificator{
    @Override
    public void notifica(Utilizator utilizator, String mesaj) {
        if (utilizator.getEmail() != null) {
            utilizator.primesteEmail(mesaj);
        } else {
            super.getSuccesor().notifica(utilizator, mesaj);
        }
    }


}
