package cts.ase.ro.design;

public class Curier implements StrategieLivrare{

    @Override
    public void livreaza(String destinatie, double km) {
        System.out.println("Livrare prin curier catre " + destinatie + " pe distanta de " + km + " km");
    }
}
