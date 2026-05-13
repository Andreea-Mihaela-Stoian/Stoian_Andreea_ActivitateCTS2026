package cts.ase.ro.design;

import java.util.List;

public class SistemAlerta implements AlertaSMS{
    private String numeSistem;
    //cream o lista
    private List<IObserver> listaClienti;

 //generam constructor
    public SistemAlerta(String numeSistem, List<IObserver> listaClienti) {
        this.numeSistem = numeSistem;
        this.listaClienti = listaClienti;
    }

    @Override
    public void adaugaClient(IObserver observer) {
        listaClienti.add(observer);
    }

    @Override
    public void stergeClient(IObserver observer) {
        listaClienti.remove(observer);

    }

    @Override
    public void trimitereAlerta(String confirmareSMS) {
        for (IObserver client:listaClienti){
            client.receptionareAlerta(confirmareSMS);
        }

    }
    // cream metode cu alerta
    public void alertaExpirareAbonament(){
        trimitereAlerta(" Urmeaza sa va expire abonamentul");
    }
    public void alertaOfertaAbonament(){
        trimitereAlerta(" Avem o oferta noua!");
    }
}
