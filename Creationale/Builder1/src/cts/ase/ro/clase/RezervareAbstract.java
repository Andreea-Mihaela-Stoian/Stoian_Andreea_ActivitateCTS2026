package cts.ase.ro.clase;
import cts.ase.ro.Rezervare;

public interface RezervareAbstract {
    Rezervare build();
    RezervareAbstract setNume(String nume);
    RezervareAbstract  setNrPersoane(int nrPersoane);
    RezervareAbstract  setZiLuna(int ziLuna);
    RezervareAbstract  setGreutateInvitati(float greutateInvitati);
    RezervareAbstract  setPlataCard(boolean plataCard);

}
