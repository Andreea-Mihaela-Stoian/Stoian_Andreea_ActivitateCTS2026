package cts.ase.ro.design;

public class ProxyJoc implements IAccesJoc {

    // obiect real protejat
    private JocOnline joc;

    // constructor generate
    public ProxyJoc(JocOnline joc) {
        this.joc = joc;
    }

    // control acces (logica proxy)
    @Override
    public void intraInJoc() {

        // conditie de acces: nivel minim
        if (joc.getJucator().getNivelCont() >= 10) {

            System.out.println("Jucator eligibil: " + joc.getJucator().getUsername());
            joc.intraInJoc();

        } else {

            System.out.println("Acces respins! Nivel insuficient pentru jocul: " + joc.getNumeJoc());
        }
    }
}
