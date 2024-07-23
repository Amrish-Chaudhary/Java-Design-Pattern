package structural.proxy;

public class MovieMediaPlayer implements Media{

	public MovieMediaPlayer() {
		loadMedia();
	}
	private void loadMedia() {
		System.out.println("Please wait untill media file is loaded...");
	}
	@Override
	public void playMedia() {
		System.out.println("Media File is ready to play");
		System.out.println("Play started...");
	}

}
