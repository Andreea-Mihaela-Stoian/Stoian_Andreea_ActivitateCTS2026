package cts.stoian.andreea.s.strategy;

public class VizualizarePretCrescator implements IProdus{

    @Override
    public void afiseazaProduse(Utilizator utilizator) {
        System.out.println(utilizator.getNume() + " vizualizeaza produsele in ordine crescatoare dupa pret.");
    }
}
