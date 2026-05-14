package cts.ase.ro.design;

public class Client {

    private String numeClient;
    private int varstaClient;

    //generate constructor
    public Client(String numeClient, int varstaClient) {
        this.numeClient = numeClient;
        this.varstaClient = varstaClient;
    }

    //generate getter pt toate atributele
    public String getNumeClient() {
        return numeClient;
    }

    public int getVarstaClient() {
        return varstaClient;
    }

}
