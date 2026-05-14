package cts.ase.ro.design;

public class LivrareAuto implements StrategieLivrare{
    @Override
    public void livreaza(String destinatie, double km) {
        System.out.println("Livrare auto catre " + destinatie + " pe distanta de " + km + " km");
    }
}
