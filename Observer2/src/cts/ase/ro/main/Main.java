package cts.ase.ro.main;

import cts.ase.ro.design.Bursa;
import cts.ase.ro.design.IObserver;
import cts.ase.ro.design.Investitor;
import cts.ase.ro.design.SistemBursa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IObserver investitor1=new Investitor("Stoian ", "Andreea ", 1234414 );
        IObserver investitor2=new Investitor("Drajneanu ", "Sorina ", 876798719 );

        List<IObserver> listaInvestitori= new ArrayList<>();
        listaInvestitori.add(investitor1);
        listaInvestitori.add(investitor2);

        SistemBursa sistemBursa1= new Bursa("BVB", listaInvestitori);
        sistemBursa1.adaugaInvestitor(new Investitor("Ganea ", "Bogdan ", 1234854234));

        sistemBursa1.stergeInvestitor(investitor2);
        ((Bursa)sistemBursa1).notificareScadereActiuni();

        sistemBursa1.adaugaInvestitor(investitor2);
        ((Bursa)sistemBursa1).notificareCrestereActiuni();

    }
}
