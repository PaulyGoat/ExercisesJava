import java.util.Scanner;

public class Day3Ex2 {

        public static void main(String[] args)
        {
            Scanner scan=new Scanner(System.in);
            double [] dTableau = new double [10];//Longueur tableau
            
        for(int i=0; i<dTableau.length; i++ ) 
        {     
            System.out.println("Entrez un chiffre reel");
            double dChiffreReel=scan.nextInt();
            dTableau [i] =dChiffreReel;//Le i sert a ce positionner dans el tableau et il est aussi l'intermediere pour rentrer les donnes dans le tableau
        }
        for(int i=0; i<10; i++ ) 
        {     
        System.out.println(dTableau[i]);
        }
        scan.close();
    }
}
