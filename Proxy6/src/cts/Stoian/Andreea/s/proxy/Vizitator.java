package cts.Stoian.Andreea.s.proxy;

public class Vizitator {
    private String nume;
    private boolean scrisoareAcceptare;
    private boolean haineProtectie;

    //generate constructor

    public Vizitator(String nume, boolean scrisoareAcceptare, boolean haineProtectie) {
        this.nume = nume;
        this.scrisoareAcceptare = scrisoareAcceptare;
        this.haineProtectie = haineProtectie;
    }

    //generate getter si setter

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isScrisoareAcceptare() {
        return scrisoareAcceptare;
    }

    public void setScrisoareAcceptare(boolean scrisoareAcceptare) {
        this.scrisoareAcceptare = scrisoareAcceptare;
    }

    public boolean isHaineProtectie() {
        return haineProtectie;
    }

    public void setHaineProtectie(boolean haineProtectie) {
        this.haineProtectie = haineProtectie;
    }
}
