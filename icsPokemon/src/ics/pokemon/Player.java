/**
 * 
 */
package ics.pokemon;

import java.util.ArrayList;

/**
 * @author Kobe
 */
public abstract class Player {
	
	protected String name;
	protected boolean isHuman;
	protected ArrayList<PokemonImpl> pokemonList;
	
	public abstract String getName();
	public abstract boolean isHuman();
	public abstract ArrayList<PokemonImpl> getPokemonList();
	public abstract void setName(String name);
	public abstract void setHuman(boolean isHuman);
	public abstract void setPokemonList(ArrayList<PokemonImpl> pokemonList);
}
