/**
 * 
 */
package ics.pokemon;

import java.util.ArrayList;

/**
 * @author KobeThuy
 *
 */
public class Comp extends Player implements AI {
	
	public Comp(String name) {
		setName(name);
	}

	@Override
	public boolean Quit() {	
		return false;
	}

	@Override
	public void Fight() {
		
	}

	@Override
	public boolean Pokemon() {
		return false;
	}

	@Override
	public boolean Item() {
		return false;
	}

	@Override
	public boolean Query() {
		return false;
	}

	@Override
	public String getName() {
		return super.name;
	}

	@Override
	public ArrayList<PokemonImpl> getPokemonList() {
		return super.pokemonList;
	}

	@Override
	public boolean isHuman() {	
		return false;
	}
	
	@Override
	public void setName(String name) {
		super.name = name;
	}

	@Override
	public void setHuman(boolean isHuman) {
		super.isHuman = isHuman;
	}

	@Override
	public void setPokemonList(ArrayList<PokemonImpl> pokemonList) {
		super.pokemonList = pokemonList;
	}

}
