import java.util.Random;

public class Day3Ex3 {
    public static void main(String[] args)
    {
        Random random=new Random();
        int [] iTableau1= new int [10]; //Declaratoin dune table avec 10 cases
        int [] iTableau2=new int [10]; 
        int iNombre;


        for(int i=0; i<iTableau1.length; i++ ) //Creation d'une variable qui va afficher les cases de la table, debutant de la case 0 jusqua la derniere, qui augmente a chaque fin de boucle
        {     
            iNombre=random.nextInt(100); // le iNombre devient la variable random pour pouvoir avoir des chiffres aleatoires jusqua 100 chiffres random
            iTableau1[i]=iNombre; //grace a "i" la case du tableau gagne la valeur de iNombre
        }
        for(int i=0; i<iTableau1.length; i++ ) //Obligatoiree pour afficher la table
        {     
            System.out.println(iTableau1[i]);//Affichage de la table
        }


        for(int i=0; i<iTableau1.length; i++ ) //Pour eviter une erreur changer la variable 'i' a 'a', on reutilse la boucle de l'autre table
        {     
            iTableau2[i]=iTableau1[iTableau1.length -1 -i];//pour l'inverser le -1 sert a commencer au dernier chiffre de la table donc 9 le -i fait en sorte que ca vas en "decroissant"
        }

        System.out.println("");//Pour espace entre tables


        for(int i=0; i<iTableau1.length; i++ ) //Pour eviter une erreur changer la variable 'i' a 'a', on reutilse la boucle de l'autre table
        {     
            System.out.println(iTableau2[i]);
        }
    }
}
