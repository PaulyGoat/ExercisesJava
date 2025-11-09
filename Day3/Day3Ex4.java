import java.util.Random;

public class Day3Ex4 {
        public static void main(String[] args)
        {
            int [] iTableau = new int [5];//Longueur 
            Random random=new Random();
            int iChiffres;
            int iMax=0;
            int iMin=Integer.MAX_VALUE;
            int iPositionMax=0;
            int iPositionMin=0;
            
        for(int i=0; i<iTableau.length; i++ ) 
        {     
            iChiffres=random.nextInt(101);//Si je mes 100 le 100 n'est pas inclus
            iTableau [i] =iChiffres;//Le i sert a ce positionner dans el tableau et il est aussi l'intermediere pour rentrer les donnes dans le tableau
            
            if (iMax<iChiffres) {
                iMax=iChiffres;//Pour enregistrer le nouveau Max
                iPositionMax=i;//Pour enregistrer la position
            }
            if (iMin>iChiffres) {
                iMin=iChiffres;
                iPositionMin=i;
            }
        }
        for(int i=0; i<iTableau.length; i++ ) 
        {     
            System.out.println(iTableau[i]);
        }
        System.out.println("");

        System.out.println("La valeur la plus petite est "+iMin+", celle la plus grande est "+iMax);
        System.out.println("");
        System.out.println("La position de la valeur la plus petite est "+iPositionMin+", celle de la plus grande est "+iPositionMax);

    }
}
