package cts.Stoian.Andreea.s.proxy;

public class Spital implements ISpital{
    private Vizitator vizitator;

    //generate constructor
    public Spital(Vizitator vizitator) {
        this.vizitator = vizitator;
    }

    //generate getter
    public Vizitator getVizitator() {
        return vizitator;
    }


    @Override
    public void permiteAccess() {
        System.out.println("Vizitatorul "+ vizitator.getNume() + " a intrat in salon.");
    }
}
