package tp2.Exo4_BookClass;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bibliotheque bibliotheque = new Bibliotheque();
		
		Book MartineEnCDA = new Book("Marcel", "Carlier", "Enfance", "12345");
		Book TotoEnCDA = new Book("Thierry", "Coppée", "Enfance", "123456");
		
		bibliotheque.addBook(MartineEnCDA);
        bibliotheque.addBook(TotoEnCDA);
		bibliotheque.listBooks();
	}

}
