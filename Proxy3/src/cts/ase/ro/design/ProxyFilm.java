package cts.ase.ro.design;

public class ProxyFilm implements IAccesFilm{
    private Film film;

    //constructor
    public ProxyFilm(Film film) {
        this.film = film;
    }

    //logica proxy
    @Override
    public void ruleazaFilm() {

        if (film.getUtilizator().getVarsta() >= film.getRatingVarsta()) {
            System.out.println("Acces permis pentru utilizator: " + film.getUtilizator().getUsername());
            film.ruleazaFilm();
        } else {
            System.out.println("Acces interzis - varsta insuficienta pentru filmul: " + film.getNumeFilm());
        }
    }
}
