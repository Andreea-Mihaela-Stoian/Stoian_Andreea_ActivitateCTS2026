package cts.ase.ro.design;

public class Casetofon implements ICasetofon{
    private String model;
    private boolean radio;
    private int volum;

    // generate constructor
    public Casetofon(String model, boolean radio, int volum) {
        this.model = model;
        this.radio = radio;
        this.volum = volum;
    }

    //generate toString()
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Casetofon{");
        sb.append("model='").append(model).append('\'');
        sb.append(", radio=").append(radio);
        sb.append(", volum=").append(volum);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void redareCaseta() {
        // metoda din sistemul vechi
        System.out.println("Casetofonul reda muzica din: "+this.model+" are radio: " + this.radio);
    }
}
