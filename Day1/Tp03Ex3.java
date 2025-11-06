
import java.util.Scanner;

public class Tp03Ex3 {

     public static void main(String[] args){
      Scanner scan = new Scanner(System.in);  
      System.out.println("Entrez votre le premier age");
      int iAgePersonne1=scan.nextInt();
      System.out.println("Entrez votre le deuxieme age");
      int iAgePersonne2=scan.nextInt();
      double dMoyenne;
      dMoyenne = (iAgePersonne1+iAgePersonne2)/2;
      System.out.println("La moyenne d'age est de " +dMoyenne);
      scan.close();
     }
}
