package cts.ase.ro.clase;

public class Masina implements InterfataPrototype {
    private String brand;
    private String model;
    private String culoare;
    private float capacitateMotor;
    private int pret;

// constructor cu validari
    public Masina(String brand, String model, String culoare, float capacitateMotor, int pret) {
        if (brand.length() > 2) {
            this.brand = brand;
        } else {
            this.brand = "Necunoscut";
        }

        if (model.length() > 1) {
            this.model = model;
        } else {
            this.model = "Standard";
        }

        if (capacitateMotor >= 0.8 && capacitateMotor <= 6.0) {
            this.capacitateMotor = capacitateMotor;
        } else {
            this.capacitateMotor = 1.0f;
        }

        if (pret > 0) {
            this.pret = pret;
        } else {
            this.pret = 0;
        }
    }
// constructor gol -> să nu poată fi creat obiectul direct fără date valide
    private Masina() {}

   // generate -> setter
    public void setPret(int pret) {
        this.pret = pret;
    }

    // generate -> toString()
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", capacitateMotor=").append(capacitateMotor);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public InterfataPrototype copy() {
        return null;
    }
}