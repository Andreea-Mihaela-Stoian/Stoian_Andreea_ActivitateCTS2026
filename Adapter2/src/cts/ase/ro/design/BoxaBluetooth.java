package cts.ase.ro.design;

public class BoxaBluetooth implements IBoxaBluetooth{
    private String brand;
    private boolean rgb;
    private int autonomie;

//generate constructor
    public BoxaBluetooth(String brand, boolean rgb, int autonomie) {
        this.brand = brand;
        this.rgb = rgb;
        this.autonomie = autonomie;
    }
//generate toString()
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BoxaBluetooth{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", rgb=").append(rgb);
        sb.append(", autonomie=").append(autonomie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void conectareBluetooth() {
        System.out.println("Boxa bluetooth conectata: " + this.brand);
    }
}
