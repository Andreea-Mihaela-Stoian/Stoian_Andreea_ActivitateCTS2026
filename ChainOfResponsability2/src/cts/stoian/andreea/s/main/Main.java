package cts.stoian.andreea.s.main;

import cts.stoian.andreea.s.chain.*;

public class Main {
    static void main(String[] args) {
        // creare pagina 1
        PaginaWeb pagina1 = new PaginaWeb("Pagina produse");
        pagina1.adaugaItem(new Item("paragraf", "rosu", true, true));
        pagina1.adaugaItem(new Item("imagine", "color", false, false));
        pagina1.adaugaItem(new Item("paragraf", "albastru", true, false));

        // creare pagina 2
        PaginaWeb pagina2 = new PaginaWeb("Pagina promotii");
        pagina2.adaugaItem(new Item("imagine", "color", false, false));
        pagina2.adaugaItem(new Item("paragraf", "verde", false, true));

        // creare filtre
        Filtru filtruImagini = new FiltruEliminareImagini();
        Filtru filtruParagraf = new FiltruParagrafSimplu();
        Filtru filtruFinal = new FiltruFinal();

        // construire lant
        filtruImagini.setSuccesor(filtruParagraf);
        filtruParagraf.setSuccesor(filtruFinal);

        System.out.println("------ PAGINA 1 ------");

        // pornire lant pentru pagina 1
        filtruImagini.aplicaFiltru(pagina1);

        System.out.println("------ PAGINA 2 ------");

        // pornire lant pentru pagina 2
        filtruImagini.aplicaFiltru(pagina2);
    }
}
 /*
Am ales Chain of Responsibility deoarece cerinta presupune un fluxde filtrari aplicate succesiv asupra unei pagini web.
Fiecare filtru realizeaza o etapa si transmite pagina catre urmatorul filtru din lant.
Etapele pot fi schimbate sau se pot adauga filtre noi.
*/
