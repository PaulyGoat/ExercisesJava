package cherubinpa.Day2;
import java.util.Scanner;

public class Day2Ex6 {
    public static void main(String[] args){
            Scanner scan= new Scanner(System.in);
            int iChiffreEntier;
            int iMax=0;
            int iMin=Integer.MAX_VALUE;
            int iSomme=0;
            int iCompteur=0;
            int iMoyenne;

            do{
            System.out.println("Entrez un chiffre entier");
            iChiffreEntier=scan.nextInt();
            if(iChiffreEntier!=0){
                iCompteur++;
                iSomme+=iChiffreEntier;
            }
            if(iMax<iChiffreEntier){
                iMax=iChiffreEntier;
            }
            if(iMin>iChiffreEntier){
                iMin=iChiffreEntier;
            }
            }while(iChiffreEntier!=0);
            iMoyenne=iSomme/iCompteur;
            System.out.println("Le chiffre le plus petit etait "+iMin);
            System.out.println("Le chiffre le plus grand etait "+iMax);
            System.out.println("La moyenne de toutes les valeurs entrer est de "+iMoyenne);
            scan.close();
        }
}
