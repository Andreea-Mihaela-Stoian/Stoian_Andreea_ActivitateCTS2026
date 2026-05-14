package cts.ase.ro.design;

public class ComandaStop implements Command{
    private Melodie melodie;

    // constructor generate
    public ComandaStop(Melodie melodie) {
        this.melodie = melodie;
    }

    // executa actiunea de stop
    @Override
    public void executa() {
        melodie.stop();
    }
}
