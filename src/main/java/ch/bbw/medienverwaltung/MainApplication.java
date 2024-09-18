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
		//

		CD cd1 = new CD("Norah Jones", "Fall", 13, 68);
		CD cd2 = new CD("Ramones", "Greatest Hits", 20, 90);
		CD cd3 = new CD("Neil Young", "Hitchhiker", 20, 90);
		Video v1 = new Video("Lord of the Rings", "Peter Jackson", 186);
		Video v2 = new Video("Bad Moms", "Scott Moore, Jon Lucas", 100);
		Buch bh1 = new Buch("Das Parfüm", "Patrick Süskind", "1234567890", 1294);


		db.addItem(cd1);
		db.addItem(cd2);
		db.addItem(cd3);
		db.addItem(v1);
		db.addItem(v2);
		db.addItem(bh1);
		//db.addBook(book);

		db.printList();
		

		System.out.println(bh1);
	}
}
