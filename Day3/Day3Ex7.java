import java.util.Random;

public class Day3Ex7 {
    public static void main(String[] args)
    {
        int [] iTableau=new int[10];
        Random random=new Random();
        int iChiffres=0;
        nombresOccurences(iTableau);

        for(int i=0; i<iTableau.length; i++)
        {
            iChiffres=random.nextInt(5);
            iTableau[i]=iChiffres;
        }
    }

    public static void nombresOccurences(int iTableau[])
    {
        Object [] [] iTableau2{
            {"Nombre 0","Nombre 1","Nombre 2","Nombre 3","Nombre 4"}
            {}
        };
    }
}
