import java.util.Random;

public class Day3Ex7 {
    public static void main(String[] args)
    {
        int [] iTableau=new int[10];
        Random random=new Random();
        int iChiffres=0;
        int iCompteur0=0;
        int iCompteur1=0;
        int iCompteur2=0;
        int iCompteur3=0;
        int iCompteur4=0;



        for(int i=0; i<iTableau.length; i++)
        {
            iChiffres=random.nextInt(5);
            iTableau[i]=iChiffres;
        }       
        for(int i=0; i<iTableau.length; i++)
        {
            if(iTableau[i]==0)
            {
                iCompteur0++;
            }
            if(iTableau[i]==1)
            {
                iCompteur1++;
            }          
            if(iTableau[i]==2)
            {
                iCompteur2++;
            }            
            if(iTableau[i]==3)
            {
                iCompteur3++;
            }           
            if(iTableau[i]==4)
            {
                iCompteur4++;
            }
        }
        
        nombresOccurences(iTableau, iCompteur0, iCompteur1, iCompteur2, iCompteur3, iCompteur4);
    }

    public static void nombresOccurences(int iTableau[],int iCompteur0,int iCompteur1,int iCompteur2,int iCompteur3,int iCompteur4)
    {
        Object [] [] iTableau2={
            {"Nombre 0","Nombre 1","Nombre 2","Nombre 3","Nombre 4"},
            {iCompteur0,iCompteur1,iCompteur2,iCompteur3,iCompteur4}
        };

        for(int i=0; i<iTableau2.length; i++)//Changer de ligne: Ligne de nombres ou lignes de compteur 
        {
            for(int j=0; j<iTableau2[i].length; j++)//Parcourir une ranger au complet
            {
                System.out.print(iTableau2[i][j]+"   "); 
            }
                System.out.println(""); 
        }
    }
}
