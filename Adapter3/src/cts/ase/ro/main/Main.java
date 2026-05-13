package cts.ase.ro.main;

import cts.ase.ro.design.*;

public class Main {
    public static void main(String[] args) {
        //obiect din sistemul vechi
        ICashPayment cash=new Cash(200, "Bucuresti");
        cash.platesteCash();

        //obiect din sistemul nou
        ICardPayment card=new Card("Visa", "ING", 550);
        card.platesteCard();

        System.out.println("-------Dupa adaptare--------");
        //adapter -> folosim card prin cash
        ICashPayment adapter= new CashToCardAdapter(card);
        adapter.platesteCash();
    }
}
