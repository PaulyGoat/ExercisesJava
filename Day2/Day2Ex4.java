package cherubinpa.Day2;
import java.util.Scanner;

public class Day2Ex4 {
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        int iValeur;

        int iTentatives = 0;
        do{
            if(iTentatives > 0) System.out.println("Le chiffre nest pas entre 0 et 100");
            System.out.println("Entrez une valeure entre 0 et 100");
            iValeur=scan.nextInt();
            iTentatives++;
        }while(iValeur<=100 || iValeur>=0);
         System.out.println("La valueur est"+iValeur);
         scan.close();
    }
}
