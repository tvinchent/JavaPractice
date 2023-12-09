package helloWorld;

import java.text.Normalizer;
import java.util.Scanner;

public class NumberOfDaysCharacters {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String mois;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrez votre mois en lettres : ");
        mois = lectureClavier.nextLine();
        

        int annee;
        System.out.print("Entrez l'année en chiffre : ");
        annee = lectureClavier.nextInt();
        lectureClavier.close();

        int days;
        mois = traiterMois(mois);
        System.out.print("Mois :" + mois);
        switch (mois) {
            case "janvier", "mars", "mai", "juillet", "aout", "octobre", "decembre":
                days = 31;
                break;
            case "fevrier":
                days = isBisextile(annee) ? 29 : 28;
                break;
            default:
                days = 30;
        }
        System.out.print("Nombre de jours : " + days);
    }

    public static String traiterMois(String mois) {
        // Convertir en minuscules
        String moisEnMinuscules = mois.toLowerCase();

        String moisSansCaracteresSpeciaux = Normalizer.normalize(moisEnMinuscules, Normalizer.Form.NFD);
        String sansAccents = moisSansCaracteresSpeciaux.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        // Retourner le résultat traité
        return sansAccents;
    }

    public static boolean isBisextile(int annee) {
        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
