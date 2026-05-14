package cts.ase.ro.design;

public class ComandaPornire implements Command {

    private MisiuneJoc misiune;

    // constructor generate
    public ComandaPornire(MisiuneJoc misiune) {
        this.misiune = misiune;
    }

    // executa actiunea de pornire
    @Override
    public void executa() {
        misiune.porneste();
    }
}