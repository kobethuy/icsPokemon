/**
 * 
 */
package ics.pokemon;

import java.util.ArrayList;

/**
 * @author KobeThuy
 *
 */
public class Human extends Player implements Turn {
	
	public Human(String name) {
		setName(name);
		setPokemonList(new ArrayList<PokemonImpl>());
	}

	@Override
	public void Fight() {
		
	}

	@Override
	public boolean Pokemon() {
		return true;
	}

	@Override
	public boolean Item() {
		return true;
	}

	@Override
	public boolean Quit() {
		return true;
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
