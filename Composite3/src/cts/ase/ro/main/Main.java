package cts.ase.ro.main;

import cts.ase.ro.design.Biblioteca;
import cts.ase.ro.design.Carte;
import cts.ase.ro.design.Sectiune;

public class Main {
    public static void main(String[] args) throws Exception {

        // composite (sectiuni)
        Sectiune biblioteca = new Sectiune("Biblioteca Centrala");
        Sectiune sectiuneIT = new Sectiune("IT");
        Sectiune sectiuneLiteratura = new Sectiune("Literatura");

        Sectiune subsectiuneJava = new Sectiune("Java");
        Sectiune subsectiuneFantasy = new Sectiune("Fantasy");

        // leaf (carti)
        Biblioteca c1 = new Carte("Clean Code", "Robert Martin");
        Biblioteca c2 = new Carte("Design Patterns", "GoF");
        Biblioteca c3 = new Carte("Harry Potter", "J.K. Rowling");
        Biblioteca c4 = new Carte("Lord of the Rings", "Tolkien");

        // construire structura
        biblioteca.adaugaNod(sectiuneIT);
        biblioteca.adaugaNod(sectiuneLiteratura);

        sectiuneIT.adaugaNod(subsectiuneJava);
        subsectiuneJava.adaugaNod(c1);
        subsectiuneJava.adaugaNod(c2);

        sectiuneLiteratura.adaugaNod(subsectiuneFantasy);
        subsectiuneFantasy.adaugaNod(c3);
        subsectiuneFantasy.adaugaNod(c4);

        // afisare structura
        biblioteca.descriere("");
    }
}
