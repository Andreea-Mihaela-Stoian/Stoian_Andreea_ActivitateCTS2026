package cts.ase.ro.decorator;

import cts.ase.ro.clase.ContJoc;
import cts.ase.ro.clase.IContJoc;

public abstract class DecoratorCont implements IContJoc {

    // obiectul pe care il decoram
    protected ContJoc contJoc;

    // constructor
    public DecoratorCont(ContJoc contJoc) {
        this.contJoc = contJoc;
    }

    // apel metoda originala + functionalitate noua
    @Override
    public void afisareCont() {
        contJoc.afisareCont();
        System.out.println("Multumim pentru activitate!");
    }

    // metoda abstracta specifica decoratorului
    public abstract void acordaBonus(int bonus);
}
