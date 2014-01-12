/**
 * 
 */
package ics.pokemon;

import java.util.ArrayList;

/**
 * @author Kobe
 */
public class PokemonImpl extends Pokemon{
		
	public PokemonImpl (String name, int level) {
		setHealth(100);
		setLevel(level);
		setName(name);
	}

	@Override
	public int getHealth() {
		return super.health;
	}

	@Override
	public int getLevel() {
		return super.level;
	}
	
	@Override
	public String getName() {
		return super.name;
	}
	
	@Override
	public String getType() {
		return super.type;
	}

	@Override
	public ArrayList<String> getMoveList() {
		return super.moveList;
	}
	
	@Override
	public void setHealth(int health) {
		super.health = health;
	}

	@Override
	public void setLevel(int level) {
		super.level = level;
	}

	@Override
	public void setName(String name) {
		super.name = name;
	}

	@Override
	public void setType(String type) {
		super.type = type;
	}

	@Override
	public void setMoveList(ArrayList<String> moveList) {
		super.moveList = moveList;
	}
}
