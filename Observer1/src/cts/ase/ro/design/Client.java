package cts.ase.ro.design;

public class Client implements IObserver{
    private String nume;
    private String prenume;
    private float nrTelefon;

// generate constructor
    public Client(String nume, String prenume, float nrTelefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void receptionareAlerta(String confirmareSMS) {
        System.out.println(nume+prenume+"A primit SMS"+confirmareSMS);
    }
}
