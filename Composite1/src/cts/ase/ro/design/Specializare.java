package cts.ase.ro.design;

public class Specializare implements StructuraUniversitate{
    private String numeSpecializare;

    public Specializare(String numeSpecializare) {
        this.numeSpecializare = numeSpecializare;
    }

    @Override
    public void adaugaNod(StructuraUniversitate nod) throws Exception {
        throw new Exception("Este nod frunza (Specializare nu poate avea copii)");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Este nod frunza");
    }

    @Override
    public void stergeNod(StructuraUniversitate nod) throws Exception {
        throw new Exception("Este nod frunza");
    }

    @Override
    public void descriere(String indent) {
        // afisare specializare
        System.out.println(indent + "Specializare: " + this.numeSpecializare);
    }
}
