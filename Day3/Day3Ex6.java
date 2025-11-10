import java.util.Random;

public class Day3Ex6 {
    public static void main(String[] args)
    {
        int [] iTableau ={-65,-34,7,-3,-43,14,23,-9,45,11};
        int iChiffre=0;
        int iSommeN=0;
        int iSommeP=0;

        for(int i=0; i<iTableau.length; i++){
            iChiffre=iTableau[i];
            if(iChiffre>0)
            {
                iSommeP+=iChiffre;
            }
            else
            {
                iSommeN+=iChiffre;
            }
        }
        System.out.println("La somme negative est de "+iSommeN+" la somme positive est"+iSommeP);
        System.out.println("");

        int [] iTableau2= new int[5];
        Random random=new Random();
        int iChiffre1=0;
        int iSommeBN=0;
        int iSommeBP=0;

        for(int i=0; i<iTableau2.length; i++){
            iChiffre1=random.nextInt(201)-100;
            iTableau2[i]=iChiffre1;
            if(iChiffre1>0)
            {
                iSommeBP+=iChiffre1;
            }
            else
            {
                iSommeBN+=iChiffre1;
            }
        }for(int i=0; i<iTableau2.length; i++){
        System.out.println(iTableau2[i]);
        }

        System.out.println("");
        System.out.println("La somme negative est de "+iSommeBN+" la somme positive est"+iSommeBP);
    }
}
