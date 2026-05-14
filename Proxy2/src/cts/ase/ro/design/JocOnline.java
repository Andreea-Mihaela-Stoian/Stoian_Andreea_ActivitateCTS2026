package cts.ase.ro.design;

public class JocOnline implements IAccesJoc{

    private String numeJoc;
    private int dificultate;
    private String server;

    // jucatorul care incearca accesul
    private Jucator jucator;

    // constructor generate
    public JocOnline(String numeJoc, int dificultate, String server, Jucator jucator) {
        this.numeJoc = numeJoc;
        this.dificultate = dificultate;
        this.server = server;
        this.jucator = jucator;
    }

    // generate getter pt atribute
    public String getNumeJoc() {
        return numeJoc;
    }

    public int getDificultate() {
        return dificultate;
    }

    public String getServer() {
        return server;
    }

    public Jucator getJucator() {
        return jucator;
    }

    // metoda reala de acces
    @Override
    public void intraInJoc() {
        System.out.println("Acces permis in jocul: " + numeJoc);
    }
}
