package cts.ase.ro.clase;

//hover mouse peste eroare si click pe generate constructor cu super
public class Cozonac extends Brutarie{
    public Cozonac(String tipFaina) {
        super(tipFaina);
    }

    //generate toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cozonac{");
        sb.append("tipFaina='").append(tipFaina).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
