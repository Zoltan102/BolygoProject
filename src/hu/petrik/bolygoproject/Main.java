package hu.petrik.bolygoproject;

import hu.petrik.bolygoproject.bolygo.Bolygo;

public class Main {
    public static void main(String[] args) {
        for (Bolygo b : Bolygo.values()) {
            System.out.printf("%-14s %-30.0f %-15.0f\n", b, b.getTomeg(), b.getSugar());
        }
        int sulyAFoldon = 100;
        int tomeg = (int) (sulyAFoldon / Bolygo.FOLD.getGravitacio());
        for (Bolygo b : Bolygo.values()) {
            System.out.printf("100kg a %15s - %g\n", b, b.getSuly(tomeg));
        }
    }
}