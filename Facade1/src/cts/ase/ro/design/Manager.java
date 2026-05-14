package cts.ase.ro.design;

public class Manager {
    private String nume;
    private int vechime;

    public Manager(int vechime, String nume) {
        this.vechime = vechime;
        this.nume = nume;
    }

    // decide tipul de reducere pentru client
    public void aprobareReducere(Client client) {

        if (client.verificareReducere()) {
            System.out.println("Reducere premium aprobata");
        } else {
            System.out.println("Reducere standard");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Manager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", vechime=").append(vechime);
        sb.append('}');
        return sb.toString();
    }
}
