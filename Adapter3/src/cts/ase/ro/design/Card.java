package cts.ase.ro.design;

public class Card implements ICardPayment{
    private String numeCard;
    private String banca;
    private float suma;

    public Card(String numeCard, String banca, float suma) {
        this.numeCard = numeCard;
        this.banca = banca;
        this.suma = suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("numeCard='").append(numeCard).append('\'');
        sb.append(", banca='").append(banca).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void platesteCard() {
        System.out.println("Plata efectuata cu cardul: "+this.numeCard+" apartinand bancii: "+this.banca+ " in valoare de: "+this.suma);
    }
}
