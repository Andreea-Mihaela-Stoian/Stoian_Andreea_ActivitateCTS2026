package cts.ase.ro.clase;

public class Covrig extends Brutarie{
    public Covrig(String tipFaina) {
        super(tipFaina);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Covrig{");
        sb.append("tipFaina='").append(tipFaina).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
