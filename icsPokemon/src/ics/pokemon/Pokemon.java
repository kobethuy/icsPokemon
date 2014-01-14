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
	
	protected int health, level;
	protected String name, type;
	protected ArrayList<String> moveList;
	protected int attack, defense, speed, spdatk, spddef;
	
	public abstract int getHealth();
	public abstract int getLevel();
	public abstract int getAttack();
	public abstract int getDefense();
	public abstract int getSpeed();
	public abstract int getSpdatk();
	public abstract int getSpddef();
	public abstract String getName();
	public abstract String getType();
	public abstract ArrayList<String> getMoveList();
	public abstract void setHealth(int health);
	public abstract void setLevel(int level);
	public abstract void setAttack(int attack);
	public abstract void setDefense(int defense);
	public abstract void setSpeed(int speed);
	public abstract void setSpdatk(int spdatk);
	public abstract void setSpddef(int spddef);
	public abstract void setName(String name);
	public abstract void setType(String type);
	public abstract void setMoveList(ArrayList<String> moveList);
}
