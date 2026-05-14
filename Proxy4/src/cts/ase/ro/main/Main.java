package cts.ase.ro.main;

import cts.ase.ro.design.ClientBanca;
import cts.ase.ro.design.ContBancar;
import cts.ase.ro.design.ProxyContBancar;

public class Main {
    public static void main(String[] args) {

        ClientBanca clientBanca1 = new ClientBanca("Mihai", 1234);

        ContBancar cont = new ContBancar(5000, clientBanca1);

        ProxyContBancar proxy = new ProxyContBancar(cont, 1234);

        proxy.acceseazaCont();
    }
}
