package cherubinpa.Day1;
import java.util.Scanner;

public class Tp02Ex2 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);  
    System.out.println("Entrez votre salaire par heure");
    int iSalaireHeure = scan.nextInt();
    System.out.println("Entrez votre nombres d'heures travaillés");
    int NbHeures=scan.nextInt();
    int resultat=(NbHeures*iSalaireHeure)*2;
    System.out.println("Votre salaire chaque deux semaines est" + resultat);
    scan.close();
    }
}
