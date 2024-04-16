package org.example;

public class Elbil extends Bil {

    public int batteriKapacitetKWh;
    public int maxKm;
    public double whPrKm;

    public Elbil(String regNr, String mærke, String model, int batteriKapacitetKWh, int maxKm, double whPrKm, int årgang, int antalDøre) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batteriKapacitetKWh = batteriKapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public int getBatteriKapacitetKWh() {
        return batteriKapacitetKWh;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public double beregnGrønAfgiftForBilpark() {
        double kmPrL = (whPrKm / 91.25) / 100;
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
        return "Elbil: " + "Registreringsnummer: " + getRegNr() + " - Mærke: " + getMærke() + " - Model: " + getModel() + " - Batterikapacitet KWh: " + getBatteriKapacitetKWh() + " - Maksimum KM (100% opladt): " + getMaxKm() + " - Wh/PrKM: " + getWhPrKm() + " - Årgang: " + getÅrgang() + " - Antal døre: " + getAntalDøre() + ")";
    }
}