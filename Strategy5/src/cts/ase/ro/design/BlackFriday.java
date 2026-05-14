package cts.ase.ro.design;

public class BlackFriday implements StrategieReducere{

    @Override
    public double aplicaReducere(double pret) {
        return pret - (pret * 0.30);
    }
}
