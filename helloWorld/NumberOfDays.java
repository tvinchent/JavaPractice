package helloWorld;

import java.util.Scanner;

public class NumberOfDays {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mois;
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez votre mois en chiffre : ");
		mois = lectureClavier.nextInt();
		lectureClavier.close();
		
		int days;
		switch(mois) {
			case 1, 3, 5, 7, 8, 10, 12 : days = 31  ; break ;
			case 2 : days = 28 ; break ;
			default : days = 30;
		}
		System.out.print("Nombre de jours : " + days);
	}

}
