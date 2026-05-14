package cts.ase.ro.design;

public class OptiuniMasina {

    private boolean turbo;
    private String anvelope;
    private int combustibil;

    // constructor generate
    public OptiuniMasina(boolean turbo, String anvelope, int combustibil) {
        this.turbo = turbo;
        this.anvelope = anvelope;
        this.combustibil = combustibil;
    }

    // toString generate
    @Override
    public String toString() {final StringBuilder sb = new StringBuilder("OptiuniMasina{");
        sb.append("turbo=").append(turbo);
        sb.append(", anvelope='").append(anvelope).append('\'');
        sb.append(", combustibil=").append(combustibil);
        sb.append('}');

        return sb.toString();
    }

}
