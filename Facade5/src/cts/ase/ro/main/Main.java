package cts.ase.ro.main;

import cts.ase.ro.design.RestaurantFacade;

public class Main {
    public static void main(String[] args) {

        RestaurantFacade facade = new RestaurantFacade();

        facade.procesareComanda("Andreea", 22, "Ion", "Pizza", 2);
    }
}
