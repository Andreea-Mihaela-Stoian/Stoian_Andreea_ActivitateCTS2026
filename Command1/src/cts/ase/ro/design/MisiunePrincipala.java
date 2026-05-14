package cts.ase.ro.design;

public class MisiunePrincipala implements MisiuneJoc{
    private int codMisiune;

    // constructor generate
    public MisiunePrincipala(int codMisiune) {
        this.codMisiune = codMisiune;
    }

    // pornire misiune principala
    @Override
    public void porneste() {
        System.out.println("Misiunea principala cu codul " + codMisiune + " a fost pornita");
    }

    // abandonare misiune principala
    @Override
    public void abandoneaza() {
        System.out.println("Misiunea principala cu codul " + codMisiune + " a fost abandonata");
    }
}
