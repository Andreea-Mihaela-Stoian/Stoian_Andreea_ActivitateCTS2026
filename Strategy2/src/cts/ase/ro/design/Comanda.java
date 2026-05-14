package cts.ase.ro.design;

public class Comanda {
    private String numeClient;

    // strategia curenta de livrare
    private StrategieLivrare strategieLivrare;

    // generate constructor
    public Comanda(String numeClient, StrategieLivrare strategieLivrare) {
        this.numeClient = numeClient;
        this.strategieLivrare = strategieLivrare;
    }

    // constructor fara strategie (default = Curier)
    public Comanda(String numeClient) {
        this.numeClient = numeClient;
        this.strategieLivrare = new Curier();
    }

    // generate getter si setter pt strategie
    public StrategieLivrare getStrategieLivrare() {
        return strategieLivrare;
    }

    public void setStrategieLivrare(StrategieLivrare strategieLivrare) {
        this.strategieLivrare = strategieLivrare;
    }

    // metoda apel strategie
    public void proceseazaComanda(String destinatie, double km) {
        strategieLivrare.livreaza(destinatie, km);
    }
}
