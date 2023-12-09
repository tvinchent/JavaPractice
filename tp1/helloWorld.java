package tp1;

import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rayon;
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez une rayon : ");
		rayon = lectureClavier.nextInt();
		lectureClavier.close();
		
		double perimetre = rayon * Math.PI *2;
		System.out.print("Perimetre : " + perimetre + "\nBises" );
	}

}
