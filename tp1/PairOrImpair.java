package tp1;

import java.util.Scanner;

public class PairOrImpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre;
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez votre chiffre : ");
		nombre = lectureClavier.nextInt();
		lectureClavier.close();
		
		if (nombre % 2 == 0) {
			System.out.print("Pair" );
		}
		else {
			System.out.print("Impair" );
		}
	}

}
