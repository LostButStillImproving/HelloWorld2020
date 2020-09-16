package kapitel_2;

import java.util.Scanner;

public class Låneberegner {
  public static void beregnLaan(){
    //Skab en Scanner
    Scanner input = new Scanner(System.in);

    //Indtast årlig rentesats
    System.out.print("Indtast årlig rentesats, for eksempel 8.25: ");
    double aarligRentesats = input.nextDouble();

    //Få månedlig rentesats
    double maanedligRentesats = aarligRentesats / 1200;

    // Indtast antal år
    System.out.print(
            "Indtast antal år som integer, for ekempel 5: ");
    int antalAar = input.nextInt();

    // Indtast lånebeløb
    System.out.print("Indtast lånebeløb, for eksempel 120000.95: ");
    double laaneBeloeb = input.nextDouble();

    // Beregn betaling
    double maanedligBetaling = laaneBeloeb * maanedligRentesats / (1
            - 1 / Math.pow(1 + maanedligRentesats, antalAar * 12));
    double totalPayment = maanedligBetaling * antalAar * 12;

    // Vis resultat
    System.out.println("Den månedlige betaling er DKK" +
            (int)(maanedligBetaling * 100) / 100.0);
    System.out.println("Den totale betaling er DKK" +
            (int)(totalPayment * 100) / 100.0);

  }
  public static void main(String[] args) {
    beregnLaan();
  }
}
