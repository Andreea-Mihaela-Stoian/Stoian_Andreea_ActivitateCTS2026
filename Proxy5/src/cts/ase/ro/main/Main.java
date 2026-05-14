package cts.ase.ro.main;

import cts.ase.ro.design.Muzica;
import cts.ase.ro.design.ProxyMuzica;
import cts.ase.ro.design.Utilizator;

public class Main {
    public static void main(String[] args) {

        Utilizator utilizator1 = new Utilizator("Andreea", false);
        Utilizator utilizator2 = new Utilizator("Andreea", true);

        Muzica muzica1 = new Muzica("Coldplay - Fix You", utilizator1);
        Muzica muzica2 = new Muzica("Imagine Dragons - Believer", utilizator2);

        ProxyMuzica proxy1 = new ProxyMuzica(muzica1);
        ProxyMuzica proxy2 = new ProxyMuzica(muzica2);

        proxy1.redaMelodie();
        proxy2.redaMelodie();
    }
}
