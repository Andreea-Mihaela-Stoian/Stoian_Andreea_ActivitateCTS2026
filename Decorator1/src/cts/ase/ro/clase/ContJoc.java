package cts.ase.ro.clase;

public class ContJoc implements IContJoc{

    private String username;
    private int puncte;

    // constructor generate
    public ContJoc(String username, int puncte) {
        this.username = username;
        this.puncte = puncte;
    }

    // metoda de baza
    @Override
    public void afisareCont() {
        System.out.println("Contul " + username + " are " + puncte + " puncte.");
    }

    // getters & setters generate
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPuncte() {
        return puncte;
    }

    public void setPuncte(int puncte) {
        this.puncte = puncte;
    }
}
