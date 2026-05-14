package cts.ase.ro.decorator;

import cts.ase.ro.clase.ContJoc;

public class ContJocDecorat extends DecoratorCont {

    // constructor
    public ContJocDecorat(ContJoc cont) {
        super(cont);
    }

    // adaugare bonus puncte
    @Override
    public void acordaBonus(int bonus) {

        super.contJoc.setPuncte(super.contJoc.getPuncte() + bonus);
    }
}

