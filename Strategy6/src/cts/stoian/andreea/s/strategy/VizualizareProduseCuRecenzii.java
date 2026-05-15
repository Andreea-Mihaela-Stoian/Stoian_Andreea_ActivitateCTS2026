package cts.stoian.andreea.s.strategy;

public class VizualizareProduseCuRecenzii implements IProdus{

    @Override
    public void afiseazaProduse(Utilizator utilizator) {

        System.out.println(utilizator.getNume() + " vizualizeaza doar produsele care au cel putin o recenzie.");
    }
}
