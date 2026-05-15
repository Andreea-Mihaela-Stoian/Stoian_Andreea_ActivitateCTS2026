package cts.stoian.andreea.s.composite;

public class TulpinaVirus implements StructuraOMS{
    private String denumireVirus;
    private String gradRaspandire;
    private int nrCazuri;

    public TulpinaVirus(String denumireVirus, String gradRaspandire, int nrCazuri) {
        this.denumireVirus = denumireVirus;
        this.gradRaspandire = gradRaspandire;
        this.nrCazuri = nrCazuri;
    }

    @Override
    // frunza nu poate avea copii
    public void adaugaNod(StructuraOMS nod) throws Exception {

        throw new Exception("Este nod frunza");
    }

    @Override
    // frunza nu poate sterge copii
    public void stergeNod(StructuraOMS nod) throws Exception {

        throw new Exception("Este nod frunza");
    }

    @Override
    // frunza nu poate avea subnoduri
    public void getNod(int index) throws Exception {

        throw new Exception("Este nod frunza");
    }

    @Override
    // afisare virus
    public void descriere(String indent) {

        System.out.println(indent + "Virus: " + denumireVirus +
                " | raspandire: " + gradRaspandire + " | cazuri: " + nrCazuri);
    }

    @Override
    // returneaza cazurile virusului
    public int getTotalCazuri() {

        return nrCazuri;
    }
}
