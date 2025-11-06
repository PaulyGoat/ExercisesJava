
import java.util.Scanner;

public class Tp04Ex04 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez le nom de l'élève");
        String sNomEleve = scan.nextLine();
        System.out.println("Entrez votre note");
        int iNote= scan.nextInt();
        scan.close();

        if(iNote>=60){
            System.out.println("Le cours de mathématiques de "+sNomEleve+"a été réussi a "+iNote);
        }
        else{
            System.out.println("Le cours de mathématiques de "+sNomEleve+" a été échouer a "+iNote);
        }
    }
}
