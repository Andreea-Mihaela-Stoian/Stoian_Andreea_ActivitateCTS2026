package cts.ase.ro.design;

import java.util.HashMap;
import java.util.Map;

public class FlyweightJoc {
    // colectie obiecte reutilizabile
    private Map<Integer, PersonajJoc> mapPersonaje = new HashMap<>();

    // returneaza obiect existent sau creeaza unul nou
    public PersonajJoc getPersonaj(int cod, String nume, String clasaCaracter, String arma) {

        // daca obiectul nu exista -> il creeaza
        if (mapPersonaje.get(cod) == null) {
            PersonajJoc personaj = new PersonajJoc(cod, nume, clasaCaracter, arma);

            mapPersonaje.put(cod, personaj);
        }

        // returneaza obiect reutilizat
        return mapPersonaje.get(cod);
    }
}
