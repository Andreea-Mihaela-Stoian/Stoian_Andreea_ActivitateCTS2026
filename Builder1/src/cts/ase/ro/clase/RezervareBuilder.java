package cts.ase.ro.clase;
import cts.ase.ro.Rezervare;

public class RezervareBuilder implements RezervareAbstract {
    private Rezervare rezervare = null;

    public RezervareBuilder(){
        rezervare = new Rezervare();
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }

    //modifici la fiecare -  variabila.numeSetter(atribut setter)
    // si return this
    @Override
    public RezervareAbstract  setNume(String nume) {
        rezervare.setNume(nume);
        return this;
    }

    @Override
    public RezervareAbstract  setNrPersoane(int nrPersoane) {
        rezervare.setNrPersoane(nrPersoane);
        return this;
    }

    @Override
    public RezervareAbstract  setZiLuna(int ziLuna) {
        rezervare.setZiLuna(ziLuna);
        return this;
    }

    @Override
    public RezervareAbstract  setGreutateInvitati(float greutateInvitati) {
        rezervare.setGreutateInvitati(greutateInvitati);
        return this;
    }

    public RezervareAbstract  setPlataCard(boolean plataCard) {
        rezervare.setPlataCard(plataCard);
        return this;
    }
}
