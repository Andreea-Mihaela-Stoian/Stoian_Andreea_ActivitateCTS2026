package cts.ase.ro.design;

public class ComandaPlay implements Command{
    private Melodie melodie;

    // constructor generate
    public ComandaPlay(Melodie melodie) {
        this.melodie = melodie;
    }

    // executa actiunea de play
    @Override
    public void executa() {
        melodie.play();
    }
}
