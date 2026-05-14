package cts.ase.ro.design;

import java.util.HashMap;
import java.util.Map;

public class FlyweightMasina {
    // colectie masini reutilizabile
    private Map<Integer, MasinaCursa> mapMasini = new HashMap<>();

    // returneaza masina existenta sau creeaza una noua
    public MasinaCursa getMasina(int cod, String model, String brand, int vitezaMaxima) {

        // verificare existenta obiect
        if (mapMasini.get(cod) == null) {
            MasinaCursa masina = new MasinaCursa(cod, model, brand, vitezaMaxima);
            mapMasini.put(cod, masina);
        }

        // return obiect reutilizat
        return mapMasini.get(cod);
    }
}
