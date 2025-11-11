import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day4Ex1 {     public static void main(String[] args)
    {
        int [] iTableau={4,1,6};
        List<Integer> liste = new ArrayList<>();
        trierListe(iTableau,liste);//Envoyer les trucs dans la methode
    }
    public static List<Integer> trierListe(int [] iTableau,List liste)//Mettre le type de variable quon vas return
    {
        for(int i=0; i<iTableau.length; i++)
        {
            liste.add(iTableau[i]);//Rajouter le chiffre a la position du i dans la liste
        }
        System.out.println("");

        for(int i=0; i<iTableau.length; i++)
        {
            System.out.println(iTableau[i]);
        }
        Collections.sort(liste);
        System.out.println(liste);
        return liste;//Retourner une valeur
    }
}