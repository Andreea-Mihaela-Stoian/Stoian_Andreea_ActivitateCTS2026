package cts.ase.ro.design;

public class PersonajJoc implements ICaracter{
    private int cod;
    private String nume;
    private String clasaCaracter;
    private String arma;

    // constructor generate
    public PersonajJoc(int cod, String nume, String clasaCaracter, String arma) {
        this.cod = cod;
        this.nume = nume;
        this.clasaCaracter = clasaCaracter;
        this.arma = arma;
    }

    // toString generate
    @Override
    public String toString() {final StringBuilder sb = new StringBuilder("PersonajJoc{");
        sb.append("cod=").append(cod);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", clasaCaracter='").append(clasaCaracter).append('\'');
        sb.append(", arma='").append(arma).append('\'');
        sb.append('}');

        return sb.toString();
    }

    // afisare obiect flyweight + state extrinsec
    @Override
    public void descriere(OptiuniGrafice optiuniGrafice) {
        System.out.println(this.toString() + optiuniGrafice.toString());
    }
}
