package cts.ase.ro.observer;

public class Utilizator implements Observer{
    private String nume;
    private String usernameAplicatie;
    private String email;

    // constructor generate
    public Utilizator(String nume, String usernameAplicatie, String email) {
        this.nume = nume;
        this.usernameAplicatie = usernameAplicatie;
        this.email = email;
    }

    // getters si setters generate
    public String getNume() {
        return nume;
    }

    public String getUsernameAplicatie() {
        return usernameAplicatie;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void primesteNotificareAplicatie(String mesaj) {
        System.out.println(this.nume + " a primit notificare in aplicatie: " + mesaj);
    }

    @Override
    public void primesteEmail(String mesaj) {
        System.out.println(this.nume + " a primit email cu mesajul: " + mesaj);
    }
}
