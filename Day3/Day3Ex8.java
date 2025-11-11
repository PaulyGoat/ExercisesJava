
public class Day3Ex8 {
    public static void main(String[] args)
    {
        Object [] [] Tableau={
            {"Étudiants","Pierre","André","Julie","Brigitte","Anne","Olivier","Simon","Nadine"},
            {"TP1",65,78,43,82,76,91,71,96},
            {"TP2",45,55,67,89,100,95,92,81},
            {"Examen1",34,65,21,67,75,54,69,54}
        };//Object = String et Int
        System.out.println("La moyenne de l'exercise 1 est : "+moyEval(Tableau, 1));//Sert a "utiliser" la premiere ligne
        System.out.println("La moyenne de l'exercise 2 est : "+moyEval(Tableau, 2));
        System.out.println("La moyenne de l'exercise 3 est : "+moyEval(Tableau, 3));
        System.out.println("");
        System.out.println("La moyenne de Pierre est : "+moyÉtu(Tableau, 1));
        System.out.println("La moyenne d'André est : "+moyÉtu(Tableau, 2));
        System.out.println("La moyenne de Julie est : "+moyÉtu(Tableau, 3));
        System.out.println("La moyenne de Brigitte est : "+moyÉtu(Tableau, 4));
        System.out.println("La moyenne de Anne est : "+moyÉtu(Tableau, 5));
        System.out.println("La moyenne d'Olivier est : "+moyÉtu(Tableau, 6));
        System.out.println("La moyenne de Simon est : "+moyÉtu(Tableau, 7));
        System.out.println("La moyenne de Nadine est : "+moyÉtu(Tableau, 8));
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
    public static double moyÉtu(Object [] [] Tableau,int iCollone)
    {
        double dMoyenne1=0;
        double dSomme1=0;

        for(int i=1; i<Tableau.length; i++)//Commence a la ligne 1 pour eviter la ligne des noms
        {
            dSomme1+= (int)Tableau[i][iCollone];//Precisez que ces un int le premier [] sert a la ligne et le deuxieme les collones
        }
        dMoyenne1=dSomme1/3;
        dMoyenne1=Math.round(dMoyenne1);
        return dMoyenne1;//Utiliser return quand je calcul quelque chose et qui a un rasultat, pas pour afficher des trucs
    } 
}
