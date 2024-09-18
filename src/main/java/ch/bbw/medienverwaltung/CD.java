package ch.bbw.medienverwaltung;

public class CD extends Medium {
	private String artist;
	private int numberOfTracks;
	private int totalDuration;

	public CD(String artist, String title, int numberOfTracks, int totalDuration) {
		super(title);
		this.artist = artist;
		this.numberOfTracks = numberOfTracks;
		this.totalDuration = totalDuration;
	}

	@Override
	public void print() {
		System.out.println("CD: " + artist + " - " + getTitle() + " (" + numberOfTracks + " tracks, " + totalDuration + " minutes)");
	}
}
