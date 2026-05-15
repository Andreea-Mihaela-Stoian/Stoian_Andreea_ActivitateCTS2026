package cts.stoian.andreea.s.chain;

public class FiltruFinal extends Filtru{
    @Override
    public void aplicaFiltru(PaginaWeb paginaWeb) {

        // capatul lantului
        System.out.println("Fluxul de filtrare s-a incheiat.");

        // afiseaza rezultatul final
        paginaWeb.afisarePagina();
    }
}
