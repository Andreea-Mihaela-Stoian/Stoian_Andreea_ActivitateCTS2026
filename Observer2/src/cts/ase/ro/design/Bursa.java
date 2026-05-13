package cts.ase.ro.design;

import java.util.List;

public class Bursa implements SistemBursa{
    private String numeBursa;
    private List<IObserver> listaInvestitori;

    public Bursa(String numeBursa, List<IObserver> listaInvestitori) {
        this.numeBursa = numeBursa;
        this.listaInvestitori = listaInvestitori;
    }

    @Override
    public void adaugaInvestitor(IObserver observer) {
        listaInvestitori.add(observer);

    }

    @Override
    public void stergeInvestitor(IObserver observer) {
        listaInvestitori.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (IObserver investitor: listaInvestitori) {
            investitor.primesteNotificare(mesaj);
        }

    }
    public void notificareScadereActiuni() {
        trimiteNotificare("Actiunile au scazut cu 5%");
    }

    public void notificareCrestereActiuni() {
        trimiteNotificare("Actiunile au crescut cu 10%");
    }
}
