package org.example;

import java.util.ArrayList;

public class Garage {
    private String name;
    private ArrayList<Bil> biler;

    public Garage(String name) {
        this.name = name;
        this.biler = new ArrayList<>();
    }

    public void tilføjBil(Bil bil) {
        biler.add(bil);
    }

    public double beregnGrønAfgiftForBilpark() {
        double totalGrønAfgift = 0;
        for (Bil bil : biler) {
            totalGrønAfgift += bil.beregnGrønAfgiftForBilpark();
        }
        return totalGrønAfgift;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Garage: ").append(name).append("\n");
        sb.append("Biler i garagen:\n");
        for (Bil bil : biler) {
            sb.append(bil).append("\n");
        }
        return sb.toString();
    }
}