package cts.ase.ro.design;

public class MelodiePop implements Melodie{
    private String numeMelodie;

    // constructor generate
    public MelodiePop(String numeMelodie) {
        this.numeMelodie = numeMelodie;
    }

    // actiune concreta: pornire melodie pop
    @Override
    public void play() {
        System.out.println("Melodia pop \"" + numeMelodie + "\" a pornit");
    }

    // actiune concreta: oprire melodie pop
    @Override
    public void stop() {
        System.out.println("Melodia pop \"" + numeMelodie + "\" a fost oprita");
    }
}
