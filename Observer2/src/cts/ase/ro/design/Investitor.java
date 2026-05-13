package cts.ase.ro.design;

public class Investitor implements IObserver {
    private String nume;
    private String prenume;
    private float sumaInvestita;

    public Investitor(String nume, String prenume, float sumaInvestita) {
        this.nume = nume;
        this.prenume = prenume;
        this.sumaInvestita = sumaInvestita;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + prenume + "A primit notificare: " + mesaj);
    }
}