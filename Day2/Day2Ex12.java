import java.util.Scanner;

public class Day2Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un nombre entier");
        int iNb1=scan.nextInt();
        System.out.println("Entrez un autre nombre entier");
        int iNb2=scan.nextInt();
        sommeMinMax(iNb1, iNb2);
        System.out.println("La somme des chiffres est"+sommeMinMax(iNb1, iNb2));
        scan.close();
    }

    public static int sommeMinMax(int iNb1, int iNb2) {
        int iSomme=0;
        int iMax;
        int iMin;
        if(iNb1>iNb2)
        {
            iMax=iNb1;
            iMin=iNb2;
        }
        else
        {
            iMax=iNb2;
            iMin=iNb1;
        }
        for(int i=iMin; i <= iMax ; i++){
            iSomme+=i;
        }
        return iSomme;
    }
}
