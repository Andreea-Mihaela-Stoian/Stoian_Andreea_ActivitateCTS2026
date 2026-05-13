package cts.ase.ro.design;

public class Cash implements ICashPayment {
    private float suma;
    private String locatie;

    public Cash(float suma, String locatie) {
        this.suma = suma;
        this.locatie = locatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cash{");
        sb.append("suma=").append(suma);
        sb.append(", locatie='").append(locatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void platesteCash() {
        System.out.println("Plata cash efectuata in: "+this.locatie+" in valoare de: "+this.suma);

    }
}
