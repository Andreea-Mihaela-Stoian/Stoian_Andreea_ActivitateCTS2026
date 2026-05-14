package cts.ase.ro.design;

import java.util.List;

public class SalaCinema {
    private String numeSalaCinema;
    private List<Integer> locuriLibere;
    private List<Integer> locuriOcupate;

    public SalaCinema(String numeSala, List<Integer> locuriLibere, List<Integer> locuriOcupate) {
        this.numeSalaCinema = numeSala;
        this.locuriLibere = locuriLibere;
        this.locuriOcupate = locuriOcupate;
    }

    // verifica daca locul este liber si il ocupa
    public void verificareLoc(int nrLoc) {

        for (int loc : locuriLibere) {
            if (loc == nrLoc) {
                System.out.println("Loc liber!");
                locuriOcupate.add(nrLoc);
            }
        }

        for (int loc : locuriOcupate) {
            if (loc == nrLoc) {
                System.out.println("Loc deja ocupat!");
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sala{");
        sb.append("numeSala='").append(numeSalaCinema).append('\'');
        sb.append(", locuriLibere=").append(locuriLibere);
        sb.append(", locuriOcupate=").append(locuriOcupate);
        sb.append('}');
        return sb.toString();
    }
}
