package cts.stoian.andreea.s.chain;

public class Item {
    private String tipItem;
    private String culoare;
    private boolean bold;
    private boolean italic;

    // constructor generate
    public Item(String tipItem, String culoare, boolean bold, boolean italic) {
        this.tipItem = tipItem;
        this.culoare = culoare;
        this.bold = bold;
        this.italic = italic;
    }

    public String getTipItem() {
        return tipItem;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public void setItalic(boolean italic) {
        this.italic = italic;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("tipItem='").append(tipItem).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", bold=").append(bold);
        sb.append(", italic=").append(italic);
        sb.append('}');
        return sb.toString();
    }
}
