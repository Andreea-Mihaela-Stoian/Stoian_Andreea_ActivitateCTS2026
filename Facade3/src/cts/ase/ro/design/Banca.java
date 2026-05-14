package cts.ase.ro.design;

public class Banca {
    private String numeBanca;

    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
    }

    // verifica daca clientul poate face tranzactia
    public void procesareClient(ClientBanca client) {

        if (client.esteMajor()) {
            System.out.println("Client valid pentru tranzactie");
        } else {
            System.out.println("Client respins (minor)");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banca{");
        sb.append("numeBanca='").append(numeBanca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
