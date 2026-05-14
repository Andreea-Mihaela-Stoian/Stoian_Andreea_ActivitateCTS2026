package cts.ase.ro.design;

import java.util.List;

public class CinemaFacade {
    // metoda FACADE - simplifica procesul de cumparare bilete
    public void procesareBilet(String numeClient, int varsta, int nrBilete,
                               String numeCasier, int experienta,
                               String numeSala,
                               List<Integer> locuriLibere,
                               List<Integer> locuriOcupate,
                               int nrLoc) {

        // creare obiect client
        ClientCinema client = new ClientCinema(numeClient, varsta, nrBilete);

        // creare obiect casier
        Casier casier = new Casier(numeCasier, experienta);

        // creare obiect sala
        SalaCinema sala = new SalaCinema(numeSala, locuriLibere, locuriOcupate);

        // logica ascunsa de Facade
        casier.procesareClient(client);   // verificare tip client
        sala.verificareLoc(nrLoc);        // verificare loc sala
    }
}
