package cherubinpa.Day1;
import java.util.Scanner;


public class Tp01Ex1
{
    
  
    
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String premier = "Le premier chiffre est plus grand que le deuxième";
    String deuxieme = "Le premier chiffre est plus petit que le deuxième";
    String troisieme = "Les chiffres sont égaux";

    System.out.println("Entrez le premier chiffre");
    int iNb1= scan.nextInt();
    System.out.println("Entrez le deuxieme chiffre");
    int iNb2= scan.nextInt();
    scan.close();



    if(iNb1>iNb2)
    {
        System.out.println(premier);
    }
    else
    {
        System.out.println(deuxieme);
    }
    if(iNb1==iNb2)
    {
        System.out.println(troisieme);
    }
}





}
