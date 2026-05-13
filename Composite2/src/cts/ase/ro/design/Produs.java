package cts.ase.ro.design;

public class Produs implements StructuraMagazin{
    private String numeProdus;
    private double pret;

    public Produs(String numeProdus, double pret) {
        this.numeProdus = numeProdus;
        this.pret = pret;
    }


    @Override
    public void adaugaNod(StructuraMagazin nod) throws Exception {
        throw new Exception("Este nod frunza (Produs nu poate avea copii)");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("Este nod frunza");
    }

    @Override
    public void stergeNod(StructuraMagazin nod) throws Exception {
        throw new Exception("Este nod frunza");
    }

    @Override
    public void descriere(String indent) {
        // afisare produs
        System.out.println(indent + "Produs: " + this.numeProdus +" Pret: " + this.pret + " RON");

    }
}

