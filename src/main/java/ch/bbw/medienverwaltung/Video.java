package ch.bbw.medienverwaltung;

public class Video extends Medium {
	private String director;
	private int duration;

	public Video(String title, String director, int duration) {
		super(title);
		this.director = director;
		this.duration = duration;
	}

	@Override
	public void print() {
		System.out.println("Video: " + getTitle() + " directed by " + director + " (" + duration + " minutes)");
	}
}
