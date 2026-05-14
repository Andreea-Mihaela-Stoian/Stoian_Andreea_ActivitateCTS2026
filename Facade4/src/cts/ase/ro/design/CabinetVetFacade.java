package cts.ase.ro.design;

import java.util.List;

public class CabinetVetFacade {

    // metoda FACADE - gestioneaza tot procesul de tratament
    public void procesareConsult(String numeAnimal, List<Integer> sanatoase, List<Integer> bolnave,
                                 String numeStapan, int varstaStapan,
                                 String numeVeterinar, int experienta,
                                 int idAnimal) {

        AnimalDeCompanie animal = new AnimalDeCompanie(numeAnimal, sanatoase, bolnave);
        Stapan stapan = new Stapan(numeStapan, varstaStapan);
        Veterinar veterinar = new Veterinar(numeVeterinar, experienta);

        veterinar.tratareAnimal(stapan); // verificare plata
        animal.verificareStare(idAnimal); // verificare stare animal
    }
}
