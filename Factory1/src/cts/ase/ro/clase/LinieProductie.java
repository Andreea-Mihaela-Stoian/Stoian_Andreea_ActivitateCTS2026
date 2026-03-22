package cts.ase.ro.clase;

public class LinieProductie {
    private static LinieProductie instanta = null;

    public static synchronized LinieProductie getInstance(){
        if(instanta == null){
            instanta = new LinieProductie();
        }
        return instanta;
    }

    private LinieProductie(){

    }
    public Brutarie getBrutarie(TipProdus tip, String tipFaina){
        return switch(tip){
            case TipProdus.Covrig -> new Covrig(tipFaina);
            case TipProdus.Cozonac -> new Cozonac(tipFaina);
            default -> null;
        };
    }
}
