package cts.ase.ro.design;

public class LivrareScuter implements StrategieLivrare{
    @Override
    public void livreaza(String destinatie, double km) {
        System.out.println("Livrare cu scuterul catre " + destinatie + " pe distanta de " + km + " km");
    }
}
