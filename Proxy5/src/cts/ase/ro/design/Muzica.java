package cts.ase.ro.design;

public class Muzica implements IMuzica{
    private String piesa;
    private Utilizator utilizator;

    public Muzica(String piesa, Utilizator utilizator) {
        this.piesa = piesa;
        this.utilizator = utilizator;
    }

    public String getPiesa() {
        return piesa;
    }

    public Utilizator getUtilizator() {
        return utilizator;
    }

    @Override
    public void redaMelodie() {
        System.out.println("Se reda piesa: " + piesa);
    }
}
