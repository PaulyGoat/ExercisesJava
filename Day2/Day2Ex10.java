
import java.util.Scanner;
public class Day2Ex10 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez le premier nombre");
        int iPremierNb=scan.nextInt();
        System.out.println("Entrez le deuxieme nombre");
        int iDeuxiemeNb=scan.nextInt();
        plusGrand(iPremierNb, iDeuxiemeNb);
        scan.close();
    }

        public static void plusGrand(int iPremierNb, int iDeuxiemeNb){
        if(iPremierNb>iDeuxiemeNb)
        {
            System.out.println("Le premier nombre est plus grand que le deuxieme");
        }
        if(iPremierNb<iDeuxiemeNb)
        {
            System.out.println("Le premier nombre est plus petit que le deuxieme");
        }
        else
        {
            System.out.println("Les chiffres sont egaux");
        }   
     }
}
