package cts.ase.ro.design;

public class Casier {
    private String nume;
    private int experienta;

    public Casier(String nume, int experienta) {
        this.nume = nume;
        this.experienta = experienta;
    }

    // decide tipul de procesare a clientului
    public void procesareClient(ClientCinema client) {

        if (client.verificareBilete()) {
            System.out.println("Client VIP - prioritate la bilete");
        } else {
            System.out.println("Client normal");
        }
    }
}
