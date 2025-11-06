import java.util.Scanner;

public class Day2Ex13 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez une température");
        int iTemperature =scan.nextInt();
        System.out.println("Entrez un type de conversion:C/c ou F/f");
        scan.nextLine();
        String sType=scan.nextLine().toUpperCase();
        double dCalcul = 0;

        if(sType.equals("C"))
        {
            dCalcul =iTemperature*9/5+32;
        }
        else if(sType.equals("F"))
        {
            dCalcul =(iTemperature-32)*5/9;
        }
        scan.close();
        System.out.println(dCalcul);
    }
}
