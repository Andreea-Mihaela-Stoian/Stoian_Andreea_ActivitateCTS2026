package cts.ase.ro;

public class Rezervare {
    private String nume;
    private int nrPersoane;
    private int ziLuna;
    private float greutateInvitati;
    private boolean plataCard;

    public Rezervare(String nume, int nrPersoane, int ziLuna, float greutateInvitati, boolean plataCard) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
        this.ziLuna = ziLuna;
        this.greutateInvitati = greutateInvitati;
        this.plataCard = plataCard;
    }
    //constructor cu valori implicite
    public Rezervare() {
        this.nume = "Sorina";
        this.nrPersoane = 12;
        this.ziLuna = 4;
        this.greutateInvitati = 150;
        this.plataCard = false;
    }
    //generate setteri pt toate atributele
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setZiLuna(int ziLuna) {
        this.ziLuna = ziLuna;
    }

    public void setGreutateInvitati(float greutateInvitati) {
        this.greutateInvitati = greutateInvitati;
    }

    public void setPlataCard(boolean plataCard) {
        this.plataCard = plataCard;
    }

    //generate toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ziLuna=").append(ziLuna);
        sb.append(", greutateInvitati=").append(greutateInvitati);
        sb.append(", plataCard=").append(plataCard);
        sb.append('}');
        return sb.toString();
    }
}
