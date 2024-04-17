package org.example;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage("Min Garage");

        Benzinbil benzinBil = new Benzinbil("DEF789", "Toyota", "Corolla", 20, 95, 2018, 4);

        Elbil elBil = new Elbil("XYZ456", "Tesla", "Model S", 85, 400, 200, 2020, 4);

        Dieselbil dieselBil = new Dieselbil("ABC123", "BMW", "X5", 18, false, 2019, 5);

        garage.tilføjBil(benzinBil);
        garage.tilføjBil(elBil);
        garage.tilføjBil(dieselBil);

        System.out.println(garage);

        double totalGrønAfgift = garage.beregnGrønAfgiftForBilpark();
        System.out.println("Samlet grøn afgift for bilparken: " + totalGrønAfgift + " kr");
    }
}