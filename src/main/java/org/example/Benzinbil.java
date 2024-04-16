package org.example;

public class Benzinbil extends Bil {

    private int oktantal;
    private int kmPrL;

    public Benzinbil(String regNr, String mærke, String model, int oktantal, int kmPrL, int årgang, int antalDøre) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.kmPrL = kmPrL;
        this.oktantal = oktantal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public double beregnGrønAfgiftForBilpark() {
        if (kmPrL >= 20 && kmPrL <= 50) {
            return 330;
        } else if (kmPrL > 15 && kmPrL < 20) {
            return 1050;
        } else if (kmPrL >= 10 && kmPrL <= 15) {
            return 2340;
        } else if (kmPrL > 5 && kmPrL < 10) {
            return 5500;
        } else {
            return 10470;
        }
    }

    @Override
    public String toString() {
        return "Benzinbil: " + "Registeringsnummer: " + getRegNr() + " - Mærke: " + getMærke() + " - Model: " + getModel() + " - Oktantal: " + getOktantal() + " - KM/PrL: " + getKmPrL() + " - Årgang: " + getÅrgang() + " - Antal døre: " + getAntalDøre() + ")";
    }
}