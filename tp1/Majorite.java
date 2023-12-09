package tp1;

import java.util.Scanner;

public class Majorite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez votre age : ");
		age = lectureClavier.nextInt();
		lectureClavier.close();
		
		if (age >= 18) {
			System.out.print("Vous êtes majeur" );
		}
		else {
			System.out.print("Vous êtes mineur" );
		}
	}

}
