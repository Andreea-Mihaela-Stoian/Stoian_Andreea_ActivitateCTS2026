package cts.ase.ro.main;

import cts.ase.ro.design.Film;
import cts.ase.ro.design.ProxyFilm;
import cts.ase.ro.design.Utilizator;

public class Main {
    public static void main(String[] args) {

        Utilizator utilizator1 = new Utilizator("Andreea", 18);

        Film film = new Film("Horror Night", 18, utilizator1);

        ProxyFilm proxy = new ProxyFilm(film);

        proxy.ruleazaFilm();
    }
}
