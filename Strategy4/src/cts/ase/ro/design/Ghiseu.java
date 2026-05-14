package cts.ase.ro.design;

public class Ghiseu implements StrategieRezervare{
    @Override
    public void rezerva(String numeClient, int locuri) {
        System.out.println(numeClient + " a rezervat LA GHISEU " + locuri + " locuri");
    }
}
