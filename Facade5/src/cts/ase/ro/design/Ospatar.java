package cts.ase.ro.design;

public class Ospatar {
    private String nume;

    public Ospatar(String nume) {
        this.nume = nume;
    }

    // proceseaza clientul si confirma preluarea comenzii
    public void preluareComanda(ClientRestaurant client) {

        if (client.poateComanda()) {
            System.out.println("Comanda preluata de ospatar");
        } else {
            System.out.println("Client minor - restrictii la comanda");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ospatar{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
