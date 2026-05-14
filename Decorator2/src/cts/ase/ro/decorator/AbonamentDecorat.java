package cts.ase.ro.decorator;

import cts.ase.ro.clase.Abonament;

public class AbonamentDecorat extends DecoratorAbonament {

    // constructor
    public AbonamentDecorat(Abonament abonament) {
        super(abonament);
    }

    // aplica reducere abonamentului
    @Override
    public void aplicaReducere(int procent) {

        super.abonament.setPret(
                super.abonament.getPret() * (100 - procent) / 100
        );
    }
}