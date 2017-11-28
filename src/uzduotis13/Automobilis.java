package uzduotis13;

public class Automobilis implements Comparable {

    private String numeris;

    private String marke;

    private String vardas;

    private String pavarde;

    public Automobilis(String numeris, String marke, String vardas, String pavarde) {
        this.numeris = numeris;
        this.marke = marke;
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    @Override
    public String toString() {
        return "Automobilis klase @ " +
                "Numeris: " + numeris + " " +
                "Vardas: " + vardas + " " +
                "Pavarde: " + pavarde + " ";
    }

    @Override
    public int compareTo(Object o) {

        Automobilis employee = (Automobilis) o;

        int comp = getPavarde().compareTo(employee.getPavarde());
        if (comp != 0) return comp;

        comp = getVardas().compareTo(employee.getVardas());
        if (comp != 0) return comp;

        return getNumeris().compareTo(employee.getNumeris());
    }
}