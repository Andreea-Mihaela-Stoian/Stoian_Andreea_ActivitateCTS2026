package cts.stoian.andreea.s.composite;

import java.util.ArrayList;
import java.util.List;

public class ZonaOMS implements StructuraOMS{
    private String denumire;
    //lista sub-noduri
    private List<StructuraOMS> listaNoduri= new ArrayList<>();

    //generate constructor , nu pt lista
    public ZonaOMS(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(StructuraOMS nod) throws Exception {
        listaNoduri.add(nod);
    }

    @Override
    public void stergeNod(StructuraOMS nod) throws Exception {
        listaNoduri.remove(nod);

    }

    @Override
    public void getNod(int index) throws Exception {
        listaNoduri.get(index);
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + "Zona: " + denumire);

        for (StructuraOMS nod : listaNoduri) {

            nod.descriere(indent + "   ");
        }
    }

    @Override
    public int getTotalCazuri() {
        int total = 0;

        for (StructuraOMS nod : listaNoduri) {

            total += nod.getTotalCazuri();
        }

        return total;
    }
}
