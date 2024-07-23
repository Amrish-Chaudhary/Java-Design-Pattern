package structural.proxy;

public class MediaApp {

	private static final Media mediaProxy = new MediaPlayerProxy();
	public static void main(String[] args) {
		
		goToMovieLibrary();
		goToFavouriteMovies();
	}

	private static void goToFavouriteMovies() {
		System.out.println("You are in the Favourite Movies section");
		mediaProxy.playMedia();
		System.out.println("\n\n");
	}

	private static void goToMovieLibrary() {
		System.out.println("You are in the Movies Library section ");
		mediaProxy.playMedia();
		System.out.println("\n\n");
	}
}
