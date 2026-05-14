package cts.ase.ro.main;

import cts.ase.ro.design.Client;
import cts.ase.ro.design.Oferta;
import cts.ase.ro.design.OfertaProxy;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Mihai", 27);

        Oferta oferta = new Oferta(3500, 15, "Summer Travel Pack", client1);

        OfertaProxy proxy = new OfertaProxy(oferta);

        proxy.rezervaOferta();
    }
}
