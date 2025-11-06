import java.util.Scanner;

public class Day2Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un nombre entier");
        int iNb1=scan.nextInt();
        factorielle(iNb1);
        System.out.println("La factorielle de "+iNb1+"est "+factorielle(iNb1));
    }

    public static int factorielle(int iNb1) {
        int iFactorielle=1;
        for(int i=1; i <= iNb1; i++){
            iFactorielle *= i;
        }
        return iFactorielle;
    }
}

