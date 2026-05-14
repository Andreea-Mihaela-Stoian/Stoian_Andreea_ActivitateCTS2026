package cts.ase.ro.design;

public class Telefon implements StrategieRezervare{

    @Override
    public void rezerva(String numeClient, int locuri) {
        System.out.println(numeClient + " a rezervat TELEFONIC " + locuri + " locuri");
    }
}
