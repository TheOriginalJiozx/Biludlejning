package org.example;

public class Dieselbil extends Bil {

    public boolean harPartikelfilter;
    public int kmPrL;

    public Dieselbil(String regNr, String mærke, String model, int kmPrL, boolean harPartikelfilter, int årgang, int antalDøre) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public double beregnGrønAfgiftForBilpark() {
        double grønAfgift = 0;
        if (kmPrL >= 20 && kmPrL <= 50) {
            grønAfgift = 330 + 130;
        } else if (kmPrL > 15 && kmPrL < 20) {
            grønAfgift = 1050 + 1390;
        } else if (kmPrL >= 10 && kmPrL <= 15) {
            grønAfgift = 2340 + 1850;
        } else if (kmPrL > 5 && kmPrL < 10) {
            grønAfgift = 5500 + 2770;
        } else if (kmPrL < 5) {
            grønAfgift = 10470 + 15260;
        }

        if (!isHarPartikelfilter()) {
            grønAfgift += 1000;
        }
        return grønAfgift;
    }


    @Override
    public String toString() {
        return "Dieselbil: " + "Registrerings nummer: " + getRegNr() + " - Mærke: " + getMærke() + " - Model: " + getModel() + " - Har partikelfilter: " + isHarPartikelfilter() + " - KM/PrL: " + getKmPrL() + " - Årgang: " + getÅrgang() + " - Antal døre: " + getAntalDøre() + ")";
    }
}
