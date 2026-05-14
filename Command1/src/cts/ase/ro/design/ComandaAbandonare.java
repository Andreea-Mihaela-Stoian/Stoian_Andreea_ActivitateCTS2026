package cts.ase.ro.design;

public class ComandaAbandonare implements Command{
    private MisiuneJoc misiune;

    public ComandaAbandonare(MisiuneJoc misiune) {
        this.misiune = misiune;
    }

    // executa actiunea de abandonare
    @Override
    public void executa() {
        misiune.abandoneaza();
    }
}
