package tp2;

import java.util.Scanner;

public class Exo2_AllMinAllMaj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringUser;
        System.out.print("Entrez votre chaine de caractere");
        Scanner lectureClavier = new Scanner(System.in);
        stringUser = lectureClavier.nextLine();
        lectureClavier.close();
        
        String stringUserMin = stringUser.toLowerCase();
        String stringUserMaj = stringUser.toUpperCase();
        System.out.print("Votre chaine en minuscule : " + stringUserMin + "\n");
        System.out.print("Votre chaine en majuscule : " + stringUserMaj);
	}

}
