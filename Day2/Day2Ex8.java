
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day2Ex8 {
  public static void main(String[] args) {
    Scanner lire = new Scanner(System.in);
    String sMot="";
    Boolean bContinuer = true; 
    List<String> motsSaisis = new ArrayList<>();//Pour creer une liste, list string pour choisir la variable, nom variable, new array, create new array

    do {

        System.out.println("Entrer des mots");
        sMot = lire.nextLine().toLowerCase();

        if (sMot.equals("stop")) {
            
            bContinuer = false;
        }
        else
        {
            motsSaisis.add(sMot);
        }
        
    } while (bContinuer == true);


    // Tri alphabétique sans tenir compte des majuscules
       // Collections.sort(motsSaisis, String.CASE_INSENSITIVE_ORDER);
    Collections.sort(motsSaisis, String.CASE_INSENSITIVE_ORDER);

    // Affichage du premier et du dernier mot
    System.out.println("Le premier mot "+motsSaisis.get(0));
    System.out.println("Le dernier mot "+motsSaisis.get(motsSaisis.size()-1));

     lire.close();
}
}
