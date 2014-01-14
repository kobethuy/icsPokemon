/**
 * 
 */
package ics.pokemon;

/**
 * @author KobeThuy
 *
 */
public class Watcher {
	
	private Human playerOne, playerTwo;
	private Comp comp;
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

	public Human getPlayerOne() {
		return this.playerOne;
	}
	
	public Human getPlayerTwo() {
		return this.playerTwo;
	}
	
	public Comp getComp() {
		return this.comp;
	}

	public void setPlayerOne(Human playerOne) {
		this.playerOne = playerOne;
	}

	public void setPlayerTwo(Human playerTwo) {
		this.playerTwo = playerTwo;
	}

	public void setComp(Comp comp) {
		this.comp = comp;
	}

	public boolean isDone() {
		return this.isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

}
