package tp2.Exo4_BookClass;

public class Book {
	String prenomAuteur;
	String nomAuteur;
	String categorie;
	int ISBN;
	
	Book(String prenomAuteurVal, String nomAuteurVal, String categorieVal, int ISBNVal){
		prenomAuteur = prenomAuteurVal;
		nomAuteur = nomAuteurVal;
		categorie = categorieVal;
		ISBN = ISBNVal;
		
		System.out.println("Nouveau livre !");
		System.out.println("Auteur : " + prenomAuteur  + " " + nomAuteur + ", Catégorie : " + categorie + ", ISBN: " + ISBN + "\n");
	}
	
}
