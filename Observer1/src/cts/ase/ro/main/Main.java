package cts.ase.ro.main;

import cts.ase.ro.design.AlertaSMS;
import cts.ase.ro.design.Client;
import cts.ase.ro.design.IObserver;
import cts.ase.ro.design.SistemAlerta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IObserver client1=new Client("Stoian ", "Andreea ", 15321754);
        IObserver client2=new Client("Ganea ", "Bogdan ", 979936970);

        List<IObserver> listaClienti= new ArrayList<>();
        listaClienti.add(client1);
        listaClienti.add(client2);

        AlertaSMS alertaSMS1= new SistemAlerta("Orange ", listaClienti);
        alertaSMS1.adaugaClient(new Client("Ionut ", "Cosmin " , 1923441));

        alertaSMS1.stergeClient(client2);
        ((SistemAlerta)alertaSMS1).alertaExpirareAbonament();

        alertaSMS1.adaugaClient(client2);
        ((SistemAlerta)alertaSMS1).alertaOfertaAbonament();

    }
}
