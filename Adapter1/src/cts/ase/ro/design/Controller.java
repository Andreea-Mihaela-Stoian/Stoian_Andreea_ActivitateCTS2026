package cts.ase.ro.design;

public class Controller implements IController{
    private String model;
    private boolean wireless;
    private int baterie;

    // generate constructor
    public Controller(String model, boolean wireless, int baterie) {
        this.model = model;
        this.wireless = wireless;
        this.baterie = baterie;
    }
    // generate toString()
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Controller{");
        sb.append("model='").append(model).append('\'');
        sb.append(", wireless=").append(wireless);
        sb.append(", baterie=").append(baterie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void conectareController() {
        System.out.println("Controller conectat: "+this.model);
    }
}
