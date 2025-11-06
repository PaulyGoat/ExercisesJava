
import java.util.Scanner;

public class Tp06Ex06 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez votre nom");
        String sNom=scan.nextLine();
        System.out.println("Entrez un chiffre");
        int iNombre1=scan.nextInt();
        System.out.println("Entrez un autre chiffre");
        int iNombre2=scan.nextInt();
        int iChoixBois;
        double dPrix;
        String sSurface;

        if(iNombre1>iNombre2){
            System.out.println("Le nombre 1 est plus grand que le deuxieme");
        }
        else
        {
            System.out.println("Le nombre 1 est plus petit que le deuxieme");
        }
        if(iNombre1==iNombre2)
        {
            System.out.println("Les chiffres sont égaux");
        }

        int iTentatives = 0;
        do{
            if(iTentatives > 0) System.out.println("Vous navez pas choisit le bon type de plancher");
            System.out.println("Choisissez un type de bois: 1- Chêne, 2-Érable, 3-Pin");
            iChoixBois=scan.nextInt();
            iTentatives++;
        }while(iChoixBois!=1 && iChoixBois!=2 && iChoixBois!=3);
        
        if(iChoixBois==1){
            dPrix=5;
            sSurface="Chene";
        }
        if(iChoixBois==2){
            dPrix=12;
            sSurface="Erable";
        }
        else{
            dPrix=10;
            sSurface="Pin";
        }

        System.out.println("Quelle est la largeur de la planche?");
        double dLargeur=scan.nextInt();
        System.out.println("Quelle est la longueur de la planche?");
        double dLongueur=scan.nextInt();
        double dAire=dLongueur*dLargeur;
        double dPrixTotal=dAire*dPrix;
        System.out.println(sNom+" la surface du plancher est "+sSurface+", qui a un cout de "+dPrix+", laire du plancher est "+dAire+"et le prix final est de "+dPrixTotal);
        scan.close();

    }
}
