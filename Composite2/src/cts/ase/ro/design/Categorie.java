package cts.ase.ro.design;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements StructuraMagazin{
    private String numeCategorie;

    // poate contine subcategorii sau produse
    private List<StructuraMagazin> listaNoduri = new ArrayList<>();

    public Categorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
    }

    @Override
    public void adaugaNod(StructuraMagazin nod) {
        listaNoduri.add(nod);
    }

    @Override
    public void getNod(int index) {
        listaNoduri.get(index);
    }

    @Override
    public void stergeNod(StructuraMagazin nod) {
        listaNoduri.remove(nod);
    }

    @Override
    public void descriere(String indent) {
        // afisam categoria curenta
        System.out.println(indent + "Categorie: " + this.numeCategorie);

        // parcurgere recursiva
        for (StructuraMagazin elem : listaNoduri) {
            elem.descriere(indent + "   ");
        }

    }
}
