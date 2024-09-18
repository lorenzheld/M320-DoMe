package ch.bbw.medienverwaltung;


import java.awt.print.Book;

public class MainApplication {

	public static void main(String[] args) {

		System.out.println("Multimediaverwaltung");
		System.out.println("--------------------");
		System.out.println();
		Ranger ranger = new Ranger("Jones", "Peter", "Sergent", 41);
		Database db = new Database();

		// hier ein paar Videos und CD's einfügen
		// ...
		CD cd1 = new CD("Jones Norah", "Fall", 13, 68) ;
		CD cd2 = new CD("Ramones", "Gratest Hits", 20, 90) ;
		CD cd3 = new CD("Neil Young", "Hitchhiker", 20, 90) ;
		Video v1 = new Video("Lord of the rings", "Jackson", 186);
		Video v2 = new Video("Bad Moms 1", "Scott Moore, Jon Lucas", 100);
		Buch bh1 = new Buch("Das Parfüm", "Stef Gygax", "isbn", 1294);


		db.addBook(bh1);
		db.addCD(cd1);
		db.addCD(cd2);
		db.addCD(cd3);
		db.addVideo(v1);
		db.addVideo(v2);
		//db.addBook(book);
		
		db.printList();

		System.out.println(bh1);
	}
}
