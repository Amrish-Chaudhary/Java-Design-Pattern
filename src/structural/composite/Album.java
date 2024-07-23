package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Album implements Playable{
	
	private List<Song> songList = new ArrayList<>();
	
	public void addSongToAlbum(Song... song) {
		for(Song s : song)
			songList.add(s);
	}

	@Override
	public void play() {
		songList.forEach(Song::play);
	}
	
}
