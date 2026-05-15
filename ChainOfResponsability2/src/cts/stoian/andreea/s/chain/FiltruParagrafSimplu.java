package cts.stoian.andreea.s.chain;

public class FiltruParagrafSimplu extends Filtru{
    @Override
    public void aplicaFiltru(PaginaWeb paginaWeb) {

        // modifica doar itemele de tip paragraf
        for (Item item : paginaWeb.getListaItemi()) {
            if (item.getTipItem().equalsIgnoreCase("paragraf")) {
                item.setCuloare("negru");
                item.setBold(false);
                item.setItalic(false);
            }
        }

        System.out.println("Paragrafele au fost simplificate.");

        // trimite pagina mai departe in lant
        if (super.getSuccesor() != null) {
            super.getSuccesor().aplicaFiltru(paginaWeb);
        }
    }
}
