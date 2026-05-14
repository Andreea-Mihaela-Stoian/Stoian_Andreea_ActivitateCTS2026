package cts.ase.ro.design;

import java.util.List;

public class MagazinFacade {

    // metoda FACADE = ascunde logica complexa
    public void procesareComanda(String numeClient, int puncte, int varsta,
                                 String numeManager, int vechime,
                                 String numeProdus,
                                 List<Integer> disponibile,
                                 List<Integer> vandute,
                                 int idProdus) {

        // creare obiect client
        Client client = new Client(numeClient, puncte, varsta);

        // creare obiect manager
        Manager manager = new Manager(vechime, numeManager);

        // creare obiect stoc
        Stoc stoc = new Stoc(numeProdus, disponibile, vandute);

        // logica ascunsa in facade
        client.verificareReducere();
        manager.aprobareReducere(client);
        stoc.verificareStoc(idProdus);
    }
}
