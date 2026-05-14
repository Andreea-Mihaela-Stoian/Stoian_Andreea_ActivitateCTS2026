package cts.ase.ro.design;

public class MasinaCursa implements IMasina{
    private int cod;
    private String model;
    private String brand;
    private int vitezaMaxima;

    // constructor generate
    public MasinaCursa(int cod, String model, String brand, int vitezaMaxima) {
        this.cod = cod;
        this.model = model;
        this.brand = brand;
        this.vitezaMaxima = vitezaMaxima;
    }

    // toString generate
    @Override
    public String toString() {final StringBuilder sb = new StringBuilder("MasinaCursa{");
        sb.append("cod=").append(cod);
        sb.append(", model='").append(model).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", vitezaMaxima=").append(vitezaMaxima);
        sb.append('}');

        return sb.toString();
    }

    // afisare completa
    @Override
    public void descriere(OptiuniMasina optiuni) {System.out.println(this.toString() + optiuni.toString());
    }
}
