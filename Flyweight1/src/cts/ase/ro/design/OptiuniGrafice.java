package cts.ase.ro.design;

public class OptiuniGrafice {
    private boolean umbre;
    private boolean efecte;
    private boolean sunet;
    private int luminozitate;

    // constructor generate
    public OptiuniGrafice(boolean umbre, boolean efecte, boolean sunet, int luminozitate) {
        this.umbre = umbre;
        this.efecte = efecte;
        this.sunet = sunet;
        this.luminozitate = luminozitate;
    }

    // toString generate
    @Override
    public String toString() {final StringBuilder sb = new StringBuilder("OptiuniGrafice{");
        sb.append("umbre=").append(umbre);
        sb.append(", efecte=").append(efecte);
        sb.append(", sunet=").append(sunet);
        sb.append(", luminozitate=").append(luminozitate);
        sb.append('}');

        return sb.toString();
    }
}
