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
	public int getAttack() {
		return super.attack;
	}

	@Override
	public int getDefense() {
		return super.defense;
	}

	@Override
	public int getSpeed() {
		return super.speed;
	}

	@Override
	public int getSpdatk() {
		return super.spdatk;
	}

	@Override
	public int getSpddef() {
		
		return super.spddef;
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
	
	@Override
	public void setAttack(int attack) {
		super.attack = attack;
	}

	@Override
	public void setDefense(int defense) {
		super.defense = defense;
	}

	@Override
	public void setSpeed(int speed) {
		super.speed = speed;		
	}

	@Override
	public void setSpdatk(int spdatk) {
		super.spdatk = spdatk;
	}

	@Override
	public void setSpddef(int spddef) {
		super.spddef = spddef;
	}
}
