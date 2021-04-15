package fr.dynivers.trouvelemot;

import android.app.Activity;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomWorld extends Activity {
    public static String[] LettreClean = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; //List des Lettres
    public static String[] Lettre = new String[]{""}; //List utilisé pour enlever les lettre aléatoirement
    public static String[] LettreEx = new String[]{""}; //List vide

    public static String[] CategorieClean = new String[]{"Membre de la famille","Livre","Instrument de musique","Vêtement","Boisson","Animal","Fabricant de voiture","Célibrité","Pays","Plante ou fleur","Appareil électrique","Jeu ou jouet","Musique/Chanson","Prénom féminin","Dessin animé","Prénom masculin","Couleur","Légume","Bonbon ou confiserie","Matière scolaire","Métier/profession","Fruit","Mot de 5 lettres","Film","Moyen de transport","Ville","Quelque chose de vert","Mot se terminant par la lettre N","Série","Site Internet","Logiciel","Evènement","Meuble","Objet décoratif","Personnage","Radio","Chaine TV","Marque","Monnaie","Langue","Pokémon","Réseau social"}; //List des catégories
    public static String[] Categorie = new String[]{""}; //List utilisé pour enlever les catégorie aléatoirement
    public static String[] CategorieEx = new String[]{""}; //list vide

    public static String Lettre() { //Géneration lettre aléatoire

        if (Lettre.length == LettreEx.length) { //Vérifier si la list est vide
            Lettre = LettreClean; //regénéré la liste
            Log.d("RandomWorld-Lettre" , "Regération de la liste");
        }

        Random r = new Random(); //Création de la variable random
        int i = r.nextInt(Lettre.length); //Tirage du nombre aléatoire

        String Result = Lettre[i];

        List<String> list = new ArrayList<>(Arrays.asList(Lettre));
        list.remove(Lettre[i]);
        Lettre = list.toArray(new String[0]);

        Log.d("RandomWorld-Lettre", Arrays.toString(Lettre));

        return Result;  //retourne un mot aléatoire dans list situé au dessus

    }

    public static String Categorie() {   //Génération catégorie aléatoire
        if (Categorie.length == CategorieEx.length) {
            Categorie = CategorieClean;
            Log.d("RandomWorld-Categorie" , "Regération de la liste");
        }

        Random r = new Random(); //Création de la variable random
        int i = r.nextInt(Categorie.length); //Tirage du nombre aléatoire

        String Result = Categorie[i];

        List<String> list = new ArrayList<>(Arrays.asList(Categorie));
        list.remove(Categorie[i]);
        Categorie = list.toArray(new String[0]);

        Log.d("RandomWorld-Categorie", Arrays.toString(Categorie));

        return Result;  //retourne un mot aléatoire dans list situé au dessus

    }

}
