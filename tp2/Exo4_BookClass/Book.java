package tp2.Exo4_BookClass;

public class Book {
	String prenomAuteur;
	String nomAuteur;
	String categorie;
	String ISBN;
	
	Book(String prenomAuteurVal, String nomAuteurVal, String categorieVal, String ISBNVal){
		prenomAuteur = prenomAuteurVal;
		nomAuteur = nomAuteurVal;
		categorie = categorieVal;
		ISBN = ISBNVal;
		
		System.out.println("Nouveau livre !");
		System.out.println("Auteur : " + prenomAuteur  + " " + nomAuteur + ", Catégorie : " + categorie + ", ISBN: " + ISBN + "\n");
	}
	
	public String code() {
		String code = String.valueOf(this.nomAuteur.charAt(0)) + this.nomAuteur.charAt(1) + this.prenomAuteur.charAt(0) + this.prenomAuteur.charAt(1) + this.categorie.charAt(0) + this.ISBN.charAt(this.ISBN.length()-2) + this.ISBN.charAt(this.ISBN.length()-1);
		return code;
	}
}
