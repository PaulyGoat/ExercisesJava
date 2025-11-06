package cherubinpa.Day2;
import java.util.Scanner;

public class Day2Ex9 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Entrez le rayon");
        int iRayon=scan.nextInt();
        circonference(iRayon);//Appel a la methode
        scan.close();
    }
        public static void circonference(int iRayon){//Appel au rayon
        double dCirconference=2* Math.PI * iRayon;
        System.out.print("La circonference est de "+dCirconference);
    }
}
