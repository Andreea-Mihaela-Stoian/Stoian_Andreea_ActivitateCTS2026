package cts.ase.ro.design;

import java.util.List;

public class AnimalDeCompanie {

    private String numeAnimal;
    private List<Integer> animaleSanatoase;
    private List<Integer> animaleBolnave;

    public AnimalDeCompanie(String numeAnimal, List<Integer> animaleSanatoase, List<Integer> animaleBolnave) {
        this.numeAnimal = numeAnimal;
        this.animaleSanatoase = animaleSanatoase;
        this.animaleBolnave = animaleBolnave;
    }

    // verifica starea animalului
    public void verificareStare(int idAnimal) {

        for (int a : animaleSanatoase) {
            if (a == idAnimal) {
                System.out.println("Animal sanatos!");
                animaleBolnave.add(idAnimal);
            }
        }

        for (int a : animaleBolnave) {
            if (a == idAnimal) {
                System.out.println("Animal necesita tratament!");
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AnimalDeCompanie{");
        sb.append("numeAnimal='").append(numeAnimal).append('\'');
        sb.append(", animaleSanatoase=").append(animaleSanatoase);
        sb.append(", animaleBolnave=").append(animaleBolnave);
        sb.append('}');
        return sb.toString();
    }
}
