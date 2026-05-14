package cts.ase.ro.observer;

import cts.ase.ro.chain.NotificatorAplicatie;
import cts.ase.ro.chain.NotificatorEmail;
import cts.ase.ro.chain.NotificatorManager;

import java.util.ArrayList;
import java.util.List;

public class MagazinOnline implements Subject{
    private List<Observer> observeri;

    // constructor
    public MagazinOnline() {
        observeri = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observeri.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        NotificatorAplicatie notificatorAplicatie = new NotificatorAplicatie();
        NotificatorEmail notificatorEmail = new NotificatorEmail();
        NotificatorManager notificatorManager = new NotificatorManager();

        // lantul de responsabilitate
        notificatorAplicatie.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        // fiecare utilizator este notificat prin prima metoda disponibila
        for (Observer observer : observeri) {
            notificatorAplicatie.notifica((Utilizator) observer, mesaj);
        }
    }
}
