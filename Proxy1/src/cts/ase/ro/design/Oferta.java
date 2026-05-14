package cts.ase.ro.design;

public class Oferta implements IOferta{

    private int pretPachet;
    private int nrServicii;
    private String denumireCampanie;
    private Client client;

    //generate constructor


    public Oferta(int pretPachet, int nrServicii, String denumireCampanie, Client client) {
        this.pretPachet = pretPachet;
        this.nrServicii = nrServicii;
        this.denumireCampanie = denumireCampanie;
        this.client = client;
    }

    //generate getter pt toate atributele
    public int getPretPachet() {
        return pretPachet;
    }

    public int getNrServicii() {
        return nrServicii;
    }

    public String getDenumireCampanie() {
        return denumireCampanie;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public void rezervaOferta() {
        System.out.println("Campania \"" + denumireCampanie + "\" a fost activata pentru client.");
    }
}
