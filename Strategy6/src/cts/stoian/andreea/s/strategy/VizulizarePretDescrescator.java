package cts.stoian.andreea.s.strategy;

public class VizulizarePretDescrescator implements IProdus{

    @Override
    public void afiseazaProduse(Utilizator utilizator) {

        System.out.println(utilizator.getNume() + " vizualizeaza produsele in ordine descrescatoare dupa pret.");
    }
}
