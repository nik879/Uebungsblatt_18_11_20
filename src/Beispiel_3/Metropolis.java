package Beispiel_3;

import java.util.Scanner;
import java.util.jar.JarEntry;

public class Metropolis {
    public static void main(String[] args) {
        boolean isCapital=false;
        String proof;
        int inhabitants;
        double taxPerPersonAndMonth;
        Scanner eingabewert = new Scanner(System.in);
        System.out.print("Geben Sie an ob es sich um eine Hauptstadt handelt (Ja oder Nein) : ");
        proof = eingabewert.next();
        if (proof == "Ja") {
            isCapital = true;
        }
        else if (proof=="Nein"){
            isCapital = false;
        }
        System.out.print("Geben Sie die Anzahl Einwohner an: ");
        inhabitants = eingabewert.nextInt();
        System.out.println("Geben Sie die Steuern pro Einwohner und Monat an (in Millionen): ");
        taxPerPersonAndMonth= eingabewert.nextDouble();

        if (isMetropolis(isCapital, inhabitants, taxPerPersonAndMonth) == true) {
            System.out.println("Es ist eine Metropole");
        }
        else {
            System.out.println("Es ist keine Metropole");
        }
    }

    public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
        if (isCapital == true && inhabitants > 100000 || inhabitants > 200000 && taxPerPersonAndMonth > 720) {
            return true;
        } else {
            return false;
        }
    }
}
