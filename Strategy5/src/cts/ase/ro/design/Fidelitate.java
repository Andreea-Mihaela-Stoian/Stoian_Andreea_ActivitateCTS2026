package cts.ase.ro.design;

public class Fidelitate implements StrategieReducere{

    @Override
    public double aplicaReducere(double pret) {
        return pret - (pret * 0.20);
    }
}
