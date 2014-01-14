/**
 * 
 */
package ics.pokemon;

/**
 * @author KobeThuy
 *
 */
public class Watcher {
	
	private static Human playerOne, playerTwo;
	private static Comp comp;
	private boolean isDone;
	
	public Watcher(String name) {
		setPlayerOne(new Human(name));
		setComp(new Comp("A.I"));
		setDone(false);
	}
	
	public Watcher(String nameOne, String nameTwo) {
		setPlayerOne(new Human(nameOne));
		setPlayerTwo(new Human(nameTwo));
		setDone(false);
	}

	public static Human getPlayerOne() {
		return playerOne;
	}
	
	public static Human getPlayerTwo() {
		return playerTwo;
	}
	
	public static Comp getComp() {
		return comp;
	}

	public void setPlayerOne(Human playerOne) {
		Watcher.playerOne = playerOne;
	}

	public void setPlayerTwo(Human playerTwo) {
		Watcher.playerTwo = playerTwo;
	}

	public void setComp(Comp comp) {
		Watcher.comp = comp;
	}

	public boolean isDone() {
		return this.isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

}
