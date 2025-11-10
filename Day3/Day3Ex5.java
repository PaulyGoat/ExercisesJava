import java.util.Random;

public class Day3Ex5 {
    public static void main(String[] args)
    {
        int [] iTableau = new int [10];//Longueur 
        Random random= new Random();
        int iChiffreR=0;

        for(int i=0; i<iTableau.length; i++)
        {     
            iChiffreR=random.nextInt(101);
            iTableau[i]=iChiffreR;
        }   
        System.out.println("Chiffre 1 est "+iTableau[0]+" le chiffre 2 est "+iTableau[9]);
        System.out.println("Chiffre 1 est "+iTableau[1]+" le chiffre 2 est "+iTableau[8]);
        
        System.out.println("");
        
        int iChiffre0=iTableau[0];//Variable qui prend la valeur
        int iChiffre1=iTableau[1];

        iTableau[0]=iTableau[9];
        iTableau[9]=iChiffre0;

        iTableau[1]=iTableau[8];
        iTableau[8]=iChiffre1;
        System.out.println("Chiffre 1 est "+iTableau[0]+" le chiffre 2 est "+iTableau[9]);
        System.out.println("Chiffre 1 est "+iTableau[1]+" le chiffre 2 est "+iTableau[8]);
        afficherTable(iTableau);
    }
    public static void afficherTable(int [] iTableau)
    {
        System.out.println("");
        for(int i=0; i<iTableau.length; i++)
        {     
        System.out.println(iTableau[i]);
        }
    }
}
