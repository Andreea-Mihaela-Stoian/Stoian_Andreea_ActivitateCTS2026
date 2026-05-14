package cts.ase.ro.design;

public class Online implements StrategieRezervare{

    @Override
    public void rezerva(String numeClient, int locuri) {
        System.out.println(numeClient + " a rezervat ONLINE " + locuri + " locuri");
    }
}
