
import java.util.Scanner;

public class Tp05Ex05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le montant");
        double dMontant = scan.nextInt();
        double dRabais= 0.25;
        double dReduction= dMontant*dRabais;
        double dPrixTotal = dMontant - dReduction;
        System.out.println("Le prix total est de"+dPrixTotal+"$");
        scan.close();
 
    }
}
