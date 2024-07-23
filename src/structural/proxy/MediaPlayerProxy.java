package structural.proxy;

public class MediaPlayerProxy implements Media{

	private MovieMediaPlayer mediaPlayer;
	
	@Override
	public void playMedia() {
		if(mediaPlayer == null) {
			mediaPlayer = new MovieMediaPlayer();
		}
		mediaPlayer.playMedia();
	}

}
