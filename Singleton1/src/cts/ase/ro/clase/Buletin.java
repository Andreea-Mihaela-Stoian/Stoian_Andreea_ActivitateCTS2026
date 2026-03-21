package cts.ase.ro.clase;

public class Buletin {
    private String nume;
    private String prenume;
    private int cnp;
    private String adresa;

    private Buletin(String nume, String prenume, int cnp, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.adresa = adresa;
    }

    private static Buletin instanta = null;

    public static synchronized Buletin getInstance(String nume, String prenume, int cnp, String adresa){
        if(instanta==null){
            instanta=new Buletin(nume, prenume, cnp, adresa);
        }
        return instanta;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Buletin{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", cnp=").append(cnp);
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
