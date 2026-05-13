package cts.ase.ro.design;

public class CashToCardAdapter implements ICashPayment{

    //obiect din sistemul nou
    private ICardPayment cardPayment;

    public CashToCardAdapter(ICardPayment cardPayment) {
        this.cardPayment = cardPayment;
    }

    @Override
    public void platesteCash() {
        // "traducem" apelul cash -> card
        cardPayment.platesteCard();
    }

}
