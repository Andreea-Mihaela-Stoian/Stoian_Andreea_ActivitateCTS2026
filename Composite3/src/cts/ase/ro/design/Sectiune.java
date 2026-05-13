package cts.ase.ro.design;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Biblioteca{
    private String numeSectiune;

    // poate contine alte sectiuni sau carti
    private List<Biblioteca> listaNoduri = new ArrayList<>();

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void adaugaNod(Biblioteca nod) {
        listaNoduri.add(nod);
    }

    @Override
    public void getNod(int index) {
        listaNoduri.get(index);
    }

    @Override
    public void stergeNod(Biblioteca nod) {
        listaNoduri.remove(nod);
    }

    @Override
    public void descriere(String indent) {
        // afisam sectiunea curenta
        System.out.println(indent + "Sectiune: " + this.numeSectiune);

        // parcurgere recursiva
        for (Biblioteca elem : listaNoduri) {
            elem.descriere(indent + "   ");
        }

    }
}
