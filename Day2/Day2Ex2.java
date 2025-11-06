
import java.util.Scanner;

public class Day2Ex2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez un mot ou une phrase");
        String sTexte =scan.nextLine();
        int iNombreChar=sTexte.length();
        System.out.println("La longueur de votre phrase est de "+iNombreChar);
        scan.close();
    }
}
