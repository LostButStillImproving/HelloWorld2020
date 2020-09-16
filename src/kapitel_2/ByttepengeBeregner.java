package kapitel_2;

import java.util.Scanner;

public class ByttepengeBeregner {
  public static void beregnByttepenge(){
    // Skab en Scanner
    Scanner input = new Scanner(System.in);

    // Modtag mængde
    System.out.print(
            "Indtast en mængde i double, for eksempel 11.56: ");
    double maengde = Double.parseDouble(input.nextLine());

    int maengdeTilbage = (int)(maengde * 100);

    // Find antal enkelte dollars
    int antalEnkelteDollars = maengdeTilbage / 100;
    maengdeTilbage = maengdeTilbage % 100;

    // Find antal quarters tilbage i den resterende mængde
    int antalQuatersTilbage = maengdeTilbage / 25;
    maengdeTilbage = maengdeTilbage % 25;

    // Find antal dimes tilbage i den resterende mængde
    int antalDimesTilbage = maengdeTilbage / 10;
    maengdeTilbage = maengdeTilbage % 10;

    // Find antal nickels tilbage i den resterende mængde
    int antalNickelsTilbage = maengdeTilbage / 5;
    maengdeTilbage = maengdeTilbage % 5;

    // Find antal pennies tilbage i den resterende mængde
    int antalPenniesTilbage = maengdeTilbage;

    // Hvis resultat
    System.out.println("Din mængde " + maengde + " består af");
    System.out.println("    " + antalEnkelteDollars + " dollars");
    System.out.println("    " + antalQuatersTilbage + " quarters ");
    System.out.println("    " + antalDimesTilbage + " dimes");
    System.out.println("    " + antalNickelsTilbage + " nickels");
    System.out.println("    " + antalPenniesTilbage + " pennies");
  }
  public static void main(String[] args) {   
  beregnByttepenge();
  }
}
