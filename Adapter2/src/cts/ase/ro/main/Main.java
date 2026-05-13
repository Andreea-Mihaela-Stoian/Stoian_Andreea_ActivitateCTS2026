package cts.ase.ro.main;

import cts.ase.ro.design.*;

public class Main {
    public static void main(String[] args) {
        // obiect din sistemul vechi
        ICasetofon casetofon = new Casetofon("Sony", true, 40);
        casetofon.redareCaseta();

        // obiect din sistemul nou
        IBoxaBluetooth boxa = new BoxaBluetooth("JBL", true, 15);
        boxa.conectareBluetooth();

        // adaptare intre cele 2 sisteme
        System.out.println("-------Dupa adaptare-------");

        ICasetofon adapter = new CasetofonAdapter(boxa);

        // sistemul vechi foloseste acum sistemul nou prin adapter
        adapter.redareCaseta();
    }
}
