package cts.ase.ro.design;

public class MelodieRock implements Melodie{
    private String numeMelodie;

    // constructor generate
    public MelodieRock(String numeMelodie) {
        this.numeMelodie = numeMelodie;
    }

    // actiune concreta: pornire melodie rock
    @Override
    public void play() {
        System.out.println("Melodia rock \"" + numeMelodie + "\" a pornit");
    }

    // actiune concreta: oprire melodie rock
    @Override
    public void stop() {
        System.out.println("Melodia rock \"" + numeMelodie + "\" a fost oprita");
    }

}
