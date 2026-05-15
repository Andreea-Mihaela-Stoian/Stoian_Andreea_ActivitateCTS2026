package cts.Stoian.Andreea.s.main;

import cts.Stoian.Andreea.s.proxy.ProxySpital;
import cts.Stoian.Andreea.s.proxy.Spital;
import cts.Stoian.Andreea.s.proxy.Vizitator;

public class Main {
    static void main(String[] args) {

        // cream vizitaorii
        Vizitator v1= new Vizitator("Ana", true, false);
        Vizitator v2 = new Vizitator("Mihai", true, false);
        Vizitator v3 = new Vizitator("Ion", false, false);
        Vizitator v4 = new Vizitator("Maria", true, false);

        // creare proxy
        ProxySpital proxySpital = new ProxySpital();

        //adauga vizitatori in lista de asteptare
        proxySpital.adaugaVisitator(new Spital(v1));
        proxySpital.adaugaVisitator(new Spital(v2));
        proxySpital.adaugaVisitator(new Spital(v3));
        proxySpital.adaugaVisitator(new Spital(v4));

        //verifica regulile si permite accesul
        proxySpital.permiteAccess();
    }
}
/*
Am ales design pattern-ul Proxy deoarece cerinta presupune existenta
unui modul intermediar care controleaza accesul vizitatorilor in spital.

Vizitatorii nu intra direct in salon, ci trec prin ProxySpital,
care verifica respectarea conditiilor:
- existenta scrisorii de acceptare
- echiparea cu haine de protectie
- existenta unui grup minim de 3 vizitatori
*/