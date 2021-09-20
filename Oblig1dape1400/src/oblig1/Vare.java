package oblig1;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris){
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;

    }
    public String getNavn() {
        return navn;
    }
    public double getPris() {
        return pris;
    }
    public int getAntall() {
        return antall;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setPris(double pris) {
        if (pris > 0) {
            this.pris = pris;
        }
    }

    public void setAntall(int antall) {
        if (antall > 0) {
            this.antall = antall;
        }
    }
    public double totalpris () {
        return this.pris*this.antall;
    }
}
