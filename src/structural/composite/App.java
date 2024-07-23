package structural.composite;

public class App {

	public static void main(String[] args) {
		Song song1 = new Song("Sa Re Ga Ma Pa...");
		Song song2 = new Song("Gata Rahe Mera Dil...");
		Song song3 = new Song("Sooraj Duba hai Yaro, Do Ghut Maje Ke Maro...");
		Song song4 = new Song("Tu...Meri Jindagi Hai...");
		Album album = new Album();
		album.addSongToAlbum(song1, song2, song3, song4);
		System.out.println("Play single song");
		song1.play();
		System.out.println("Play full album");
		album.play();
	}
}
