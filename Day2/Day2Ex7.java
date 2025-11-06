
import java.util.Scanner;

public class Day2Ex7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez du texte");
        String sTexte=scan.nextLine();
        int iNombreVoyelle=0;
        int iNombreConsonnes=0;

        for(int i=0; i<sTexte.length(); i++){ //creation de une varible, faire en sorte que la variable ne depasse pas la longueur du texte entree//
            char voyelle = sTexte.charAt(i); //pour "scanner" chaqye charactere de sTexte grace a la varibale, +1, donc next char
          if (voyelle >= 'a' && voyelle <= 'z')//Pour eviter que les espaces sont compris//
            {
                if (voyelle== 'a' || voyelle == 'e' || voyelle == 'i' || voyelle == 'o' || voyelle == 'u' || voyelle == 'y') {
                    iNombreVoyelle++;
                } else {
                    iNombreConsonnes++;
                }
            }   
        }
            System.out.println("Le nombre de voyelle est de "+iNombreVoyelle);
            System.out.println("Le nombre de consonnes est "+iNombreConsonnes);
            scan.close();
    }
}
