package cts.ase.ro.design;

public interface AlertaSMS {
    // scrii cateva actiuni
    void adaugaClient(IObserver observer);
    void stergeClient(IObserver observer);
    void trimitereAlerta(String confirmareSMS);
}
