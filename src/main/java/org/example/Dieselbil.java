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
        int partikUdlejningsAfgift = 1000;
        if (kmPrL >= 20 && kmPrL <= 50) {
            return 130;
        } else if (kmPrL > 15 && kmPrL < 20) {
            return 1390;
        } else if (kmPrL >= 10 && kmPrL <= 15) {
            return 1850;
        } else if (kmPrL > 5 && kmPrL < 10) {
            return 2770;
        } else {
            return 15260 + partikUdlejningsAfgift;
        }
    }

    @Override
    public String toString() {
        return "Dieselbil: " + "Registrerings nummer: " + getRegNr() + " - Mærke: " + getMærke() + " - Model: " + getModel() + " - Har partikelfilter: " + isHarPartikelfilter() + " - KM/PrL: " + getKmPrL() + " - Årgang: " + getÅrgang() + " - Antal døre: " + getAntalDøre() + ")";
    }
}
