package cts.ase.ro.design;

public class TastaturaGaming implements IKeyboardGaming{
    private String brand;
    private boolean rgb;
    private int nrTaste;

    public TastaturaGaming(String brand, boolean rgb, int nrTaste) {
        this.brand = brand;
        this.rgb = rgb;
        this.nrTaste = nrTaste;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TastaturaGaming{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", rgb=").append(rgb);
        sb.append(", nrTaste=").append(nrTaste);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void conectareTastatura() {
        System.out.println("Tastatura gaming conectata: "+this.brand);

    }
}
