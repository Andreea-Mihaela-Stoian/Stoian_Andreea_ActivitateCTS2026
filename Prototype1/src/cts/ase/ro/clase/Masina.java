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

        if (culoare != null && !culoare.isEmpty()) {
            this.culoare = culoare;
        } else {
            this.culoare = "necunoscuta";
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
    // constructor gol -> nu lasa obiectul sa se creeze direct fara date valide
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

    // scriem metoda copy
    @Override
    public InterfataPrototype copy() {
        Masina masina = new Masina();
        masina.brand=this.brand;
        masina.model=this.model;
        masina.capacitateMotor=this.capacitateMotor;
        masina.culoare=this.culoare;
        masina.pret=this.pret;
        return masina;
    }
}