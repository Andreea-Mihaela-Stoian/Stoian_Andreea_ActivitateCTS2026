package cts.stoian.andreea.s.chain;

public abstract class Filtru {
    private Filtru succesor;

    //getter si setter
    public Filtru getSuccesor() {
        return succesor;
    }

    public void setSuccesor(Filtru succesor) {
        this.succesor = succesor;
    }

    // metoda implementata de fiecare filtru concret
    public abstract void aplicaFiltru(PaginaWeb paginaWeb);
}
