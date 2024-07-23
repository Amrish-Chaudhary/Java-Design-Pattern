package structural.composite;

public class Song implements Playable{
	
	private final String lyrics;

	public Song(String lyrics) {
		super();
		this.lyrics = lyrics;
	}

	public String getLyrics() {
		return lyrics;
	}

	@Override
	public void play() {
		System.out.println("Playing Music:- " + lyrics);
	}

}
