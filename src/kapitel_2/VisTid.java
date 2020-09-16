package kapitel_2;

import java.util.Scanner;

public class VisTid {
  public static void visTid(){
    Scanner input = new Scanner(System.in);
    // Prompt the user for input
    System.out.print("Indtast et integer for sekunder: ");
    int sekunder = input.nextInt();

    int minutter = sekunder / 60; // Find minutter in sekunder
    int sekunderTilbage = sekunder % 60; // Sekunder tilbage
    System.out.println(sekunder + " sekunder er " + minutter +
            " minutter og " + sekunderTilbage + " sekunder");

  }
  public static void main(String[] args) {
    visTid();

  }
}
