package cts.ase.ro.design;

public class OfertaProxy implements IOferta{
    // obiect real
    private Oferta oferta;

    //generate constuctor
    public OfertaProxy(Oferta oferta) {
        this.oferta = oferta;
    }

    // control acces la oferta
    @Override
    public void rezervaOferta() {

        // conditie diferita fata de exemplu (mai CTS)
        if (oferta.getClient().getVarstaClient() >= 60) {

            System.out.println("Client senior validat: " + oferta.getClient().getNumeClient());
            oferta.rezervaOferta();

        } else {

            System.out.println("Oferta \"" + oferta.getDenumireCampanie()
                    + "\" nu este disponibila pentru varsta clientului.");
        }
    }
}
