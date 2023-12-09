package tp2;

import java.util.Scanner;

public class Exo1_countChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String stringForCounting;
        System.out.print("Entrez votre chaine de caractere");
        Scanner lectureClavier = new Scanner(System.in);
        stringForCounting = lectureClavier.nextLine();
        lectureClavier.close();
        
        int numberOfChar = stringForCounting.length();
        System.out.print("Votre chaine contient : " + numberOfChar + " caractères.");
	}

}
