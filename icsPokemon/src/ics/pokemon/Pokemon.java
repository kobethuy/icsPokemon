/**
 * 
 */
package ics.pokemon;

import java.util.ArrayList;

/**
 * @author Kobe
 *
 */
public abstract class Pokemon {
	
	public int health, level;
	public String name, type;
	public ArrayList<String> moveList;
	
	public abstract int getHealth();
	public abstract int getLevel();
	public abstract String getName();
	public abstract String getType();
	public abstract ArrayList<String> getMoveList();
	public abstract void setHealth(int health);
	public abstract void setLevel(int level);
	public abstract void setName(String name);
	public abstract void setType(String type);
	public abstract void setMoveList(ArrayList<String> moveList);
}
