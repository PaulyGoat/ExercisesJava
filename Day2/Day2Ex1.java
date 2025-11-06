
import java.util.Scanner;

public class Day2Ex1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez un mot ou une phrase");
        String sTexte =scan.nextLine().toUpperCase();
        System.out.println("Voici les texte que vous avez entrez en majuscule: "+sTexte);
        scan.close();
    }

}
