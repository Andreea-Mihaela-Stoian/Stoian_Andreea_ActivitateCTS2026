package cts.ase.ro.design;

public class MisiuneSecundara implements MisiuneJoc{
    private int codMisiune;

    // constructor generate
    public MisiuneSecundara(int codMisiune) {
        this.codMisiune = codMisiune;
    }

    // pornire misiune secundara
    @Override
    public void porneste() {
        System.out.println("Misiunea secundara cu codul " + codMisiune + " a fost pornita");
    }

    // abandonare misiune secundara
    @Override
    public void abandoneaza() {
        System.out.println("Misiunea secundara cu codul " + codMisiune + " a fost abandonata");
    }
}
