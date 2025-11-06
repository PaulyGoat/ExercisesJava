
import java.util.Scanner;

public class Day2Ex3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez un mot ou une phrase");
        String sTexte =scan.nextLine().toUpperCase();

        int compteur=0;

        for(int i=0; i < sTexte.length(); i++){
            char c = sTexte.charAt(i);
            if(c =='A'){
            compteur++;
            }
        }
        System.out.println("La lettre 'A' apparait "+compteur+"fois :"+sTexte.replace('A', '$'));
        scan.close();
    }
}
