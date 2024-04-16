package org.example;

abstract class Bil {
    public String regNr;
    public String mærke;
    public String model;
    public int årgang;
    public int antalDøre;

    public Bil(String regNr, String mærke, String model, int årgang, int antalDøre) {
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    public String getRegNr() {
        return regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public String getModel() {
        return model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public abstract double beregnGrønAfgiftForBilpark();
}