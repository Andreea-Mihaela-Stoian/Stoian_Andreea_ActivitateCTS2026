package cts.ase.ro.design;

import java.util.List;

public class Stoc {

    private String numeProdus;

    // lista produselor disponibile in stoc
    private List<Integer> produseDisponibile;

    // lista produselor deja vandute
    private List<Integer> produseVandute;

    //generate constructor
    public Stoc(String numeProdus, List<Integer> produseDisponibile, List<Integer> produseVandute) {
        this.numeProdus = numeProdus;
        this.produseDisponibile = produseDisponibile;
        this.produseVandute = produseVandute;
    }

    // verifica daca produsul exista in stoc
    public void verificareStoc(int idProdus) {

        // cauta in lista de disponibile
        for (int p : produseDisponibile) {
            if (p == idProdus) {
                System.out.println("Produs disponibil!");
                produseVandute.add(idProdus); // il mutam ca vandut
            }
        }

        // verifica daca a fost deja vandut
        for (int p : produseVandute) {
            if (p == idProdus) {
                System.out.println("Produs deja vandut!");
            }
        }
    }

    //generatae toString()
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stoc{");
        sb.append("numeProdus='").append(numeProdus).append('\'');
        sb.append(", produseDisponibile=").append(produseDisponibile);
        sb.append(", produseVandute=").append(produseVandute);
        sb.append('}');
        return sb.toString();
    }
}

