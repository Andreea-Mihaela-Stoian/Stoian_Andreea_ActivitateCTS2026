package cts.ase.ro.decorator;

import cts.ase.ro.clase.Abonament;
import cts.ase.ro.clase.IAbonament;

public abstract class DecoratorAbonament implements IAbonament{

    // obiectul decorat
    protected Abonament abonament;

    // constructor
    public DecoratorAbonament(Abonament abonament) {
        this.abonament = abonament;
    }

    // apel metoda initiala + functionalitate extra
    @Override
    public void afisareAbonament() {

        abonament.afisareAbonament();

        System.out.println("Beneficiezi de o luna gratuita!");
    }

    // metoda abstracta specifica decoratorului
    public abstract void aplicaReducere(int procent);
}