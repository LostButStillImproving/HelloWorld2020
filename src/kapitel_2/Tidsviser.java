package kapitel_2;

public class Tidsviser {
  public static void visNuvaerendeTid(){
    // Få det totale antal milisekunder siden midnat, Jan 1, 1970
    long totalMillisekonder = System.currentTimeMillis();

    // Få det totale antal sekunder siden midat, Jan 1, 1970
    long totalSekunder = totalMillisekonder / 1000;

    // Beregn det nuværende sekundt i minuttet i timen
    long nuvaerendeSekund = totalSekunder % 60;

    // Få total antal minutter
    long totalMinutter = totalSekunder / 60;

    // Udregn nuværende minut i timen
    long nuvaerendeMinut = totalMinutter % 60;

    // Få total timer
    long totalTimer = totalMinutter / 60;

    // Udregn nuværende time
    long nuvaerendeTime = totalTimer % 24;

    // Hvis resultat
    System.out.println("Nuværende tid er " + nuvaerendeTime + ":"
            + nuvaerendeMinut + ":" + nuvaerendeSekund + " GMT");

  }
  public static void main(String[] args) {
    visNuvaerendeTid();

  }
}
