import java.util.Random;

public class Day3Ex8 {
       public static void main(String[] args)
    {
        Object [] [] Tableau={
            {"Étudiants","Pierre","André","Julie","Brigitte","Anne","Olivier","Simon","Nadine"},
            {"TP1",65,78,43,82,76,91,71,96},
            {"TP2",45,55,67,89,100,95,92,81},
            {"Examen1",34,65,21,67,75,54,69,54}
        };
        System.out.println("La moyenne de l'exercise 1 est : "+moyEval(Tableau, 1));//Sert a utiliser la premiere ligne
        System.out.println("La moyenne de l'exercise 2 est : "+moyEval(Tableau, 2));
        System.out.println("La moyenne de l'exercise 3 est : "+moyEval(Tableau, 3));
    } 

    public static double moyEval(Object [] [] Tableau,int iLigne)
    {
        double dMoyenne=0;
        double dSomme=0;

        for(int i=1; i<Tableau[0].length; i++)
        {
            dSomme+= (int)Tableau[iLigne][i];//Precisez que ces un int le premier [] sert a la ligne et le deuxieme les collones
        }
        dMoyenne = dSomme / (Tableau[0].length-1);//Moins le TP1, faire gaffe au priorités d'opérations
        dMoyenne=Math.round(dMoyenne);
        return dMoyenne;

    } 
}
