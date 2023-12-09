package helloWorld;

import java.util.Scanner;

public class Bisextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int annee;
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez votre annee : ");
		annee = lectureClavier.nextInt();
		lectureClavier.close();
		
		if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
			System.out.print("Bisextile" );
		}
		else {
			System.out.print("Non bisextile" );
		}
	}

}
