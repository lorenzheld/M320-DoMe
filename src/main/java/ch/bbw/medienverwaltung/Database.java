package ch.bbw.medienverwaltung;

import java.util.ArrayList;

public class Database {

	private ArrayList<Medium> medien;

	public Database() {
		medien = new ArrayList<>();
	}

	public void addItem(Medium medium) {
		medien.add(medium);
	}

	public void printList() {
		for (Medium medium : medien) {
			medium.print();
		}
	}
}
