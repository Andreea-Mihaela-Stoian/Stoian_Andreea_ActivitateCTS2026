package cts.ase.ro.design;

import java.util.ArrayList;
import java.util.List;

public class Departament implements StructuraUniversitate{
    private String numeDepartament;

    // lista poate contine departamente sau specializari
    private List<StructuraUniversitate> listaStructuri = new ArrayList<>();

    //generate constructor
    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
    }

    @Override
    public void adaugaNod(StructuraUniversitate nod) {
        listaStructuri.add(nod);
    }

    @Override
    public void getNod(int index) {
        listaStructuri.get(index);
    }

    @Override
    public void stergeNod(StructuraUniversitate nod) throws Exception {
        listaStructuri.remove(nod);
    }

    @Override
    public void descriere(String indent) {
        // afisam departamentul curent
        System.out.println(indent + "Departament: " + this.numeDepartament);

        // parcurgere recursiva
        for (StructuraUniversitate elem : listaStructuri) {
            elem.descriere(indent + "   ");
        }

    }
}
