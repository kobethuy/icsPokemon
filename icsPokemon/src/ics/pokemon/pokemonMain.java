package ics.pokemon;

public class pokemonMain {
	public static void main(String[] args) {
		Watcher watch = new Watcher("Kobe");
		
		while (!watch.isDone()) {
			System.out.print("Player 1: ");
			watch.setDone(true);
		}
	}

}
