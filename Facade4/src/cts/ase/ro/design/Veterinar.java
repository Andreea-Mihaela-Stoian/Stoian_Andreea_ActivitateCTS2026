package cts.ase.ro.design;

public class Veterinar {
    private String nume;
    private int experienta;

    public Veterinar(String nume, int experienta) {
        this.nume = nume;
        this.experienta = experienta;
    }

    // decide modul de tratament
    public void tratareAnimal(Stapan stapan) {

        if (stapan.verificarePlata()) {
            System.out.println("Tratament complet aprobat");
        } else {
            System.out.println("Tratament de baza");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Veterinar{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", experienta=").append(experienta);
        sb.append('}');
        return sb.toString();
    }
}
