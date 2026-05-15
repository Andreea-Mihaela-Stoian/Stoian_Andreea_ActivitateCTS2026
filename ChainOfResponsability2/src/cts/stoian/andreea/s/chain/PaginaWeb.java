package cts.stoian.andreea.s.chain;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb {
    private String numePagina;
    // lista items
    private List<Item> listaItems;

    // constructor - initializeaza lista
    public PaginaWeb(String numePagina) {
        this.numePagina = numePagina;
        this.listaItems = new ArrayList<>();
    }

    // adauga item in pagina
    public void adaugaItem(Item item) {
        listaItems.add(item);
    }

    // getter lista - folosit de filtre
    public List<Item> getListaItemi() {
        return listaItems;
    }

    // afiseaza pagina dupa filtrare
    public void afisarePagina() {
        System.out.println("Pagina web: " + numePagina);
        for (Item item : listaItems) {
            System.out.println(item);
        }
    }
}
