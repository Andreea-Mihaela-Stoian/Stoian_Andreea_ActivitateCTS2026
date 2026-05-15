package cts.stoian.andreea.s.chain;

public class FiltruEliminareImagini extends Filtru{

    @Override
    public void aplicaFiltru(PaginaWeb paginaWeb) {

        // elimina toate itemele de tip imagine
        paginaWeb.getListaItemi().removeIf(item -> item.getTipItem().equalsIgnoreCase("imagine"));

        System.out.println("Au fost eliminate imaginile.");

        // trimite pagina mai departe in lant
        if (super.getSuccesor() != null) {
            super.getSuccesor().aplicaFiltru(paginaWeb);
        }
    }
}
