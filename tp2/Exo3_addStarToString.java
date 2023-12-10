package tp2;

import java.util.Scanner;

public class Exo3_addStarToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringUser;
        System.out.print("Entrez votre chaine de caractere");
        Scanner lectureClavier = new Scanner(System.in);
        stringUser = lectureClavier.nextLine();
        lectureClavier.close();
        
        for(int i=0; i<stringUser.length(); i++) {
        	char charToPrint = i % 2 == 0 ? stringUser.charAt(i) : '*';
        	System.out.print(charToPrint);
        }
	}

}
