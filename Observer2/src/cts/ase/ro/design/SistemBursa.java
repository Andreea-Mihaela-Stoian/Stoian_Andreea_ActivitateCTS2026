package cts.ase.ro.design;

public interface SistemBursa {
    void adaugaInvestitor(IObserver observer);
    void stergeInvestitor(IObserver observer);
    void trimiteNotificare(String mesaj);
}
