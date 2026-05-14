package cts.ase.ro.design;

public class BancaFacade {
    // metoda FACADE - simplifica toate operatiile bancare
    public void procesareTranzactie(String numeClient, int varsta,
                                    String numarCont, double soldInitial,
                                    String numeBanca,
                                    double sumaRetragere) {

        // creare obiecte interne
        ClientBanca client = new ClientBanca(numeClient, varsta);
        Cont cont = new Cont(numarCont, soldInitial);
        Banca banca = new Banca(numeBanca);

        // logica ascunsa in facade
        banca.procesareClient(client);     // verificare client
        cont.verificareRetragere(sumaRetragere); // retragere bani
    }
}
