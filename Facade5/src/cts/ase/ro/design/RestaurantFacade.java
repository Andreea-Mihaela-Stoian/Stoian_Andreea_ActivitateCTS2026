package cts.ase.ro.design;

public class RestaurantFacade {
    // metoda FACADE - simplifica procesul de comanda
    public void procesareComanda(String numeClient, int varsta,
                                 String numeOspatar,
                                 String produs, int cantitate) {

        // creare obiecte interne
        ClientRestaurant client = new ClientRestaurant(numeClient, varsta);
        Ospatar ospatar = new Ospatar(numeOspatar);
        Comanda comanda = new Comanda(produs, cantitate);

        // verificare varsta
        client.poateComanda();
        // preluare comanda
        ospatar.preluareComanda(client);
        // verificare produs
        comanda.verificareComanda();
    }
}
