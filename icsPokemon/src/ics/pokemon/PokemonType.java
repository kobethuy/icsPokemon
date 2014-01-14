/**
 * 
 */
package ics.pokemon;

import java.util.ArrayList;

/**
 * @author KobeThuy
 *
 */
public class PokemonType {
	
	private String typePrim, typeSec;
	private ArrayList<String> superEffect, notEffect;
	
	public PokemonType(String type) {
		setTypePrim(type);
		setTypeSec(null);
		setSuperEffect(new ArrayList<String>());
		setNotEffect(new ArrayList<String>());
	}
	
	public PokemonType(String typeOne, String typeTwo) {
		setTypePrim(typeOne);
		setTypeSec(typeTwo);
		setSuperEffect(new ArrayList<String>());
		setNotEffect(new ArrayList<String>());
	}

	public String getTypePrim() {
		return typePrim;
	}

	public String getTypeSec() {
		return typeSec;
	}

	public ArrayList<String> getSuperEffect() {
		return superEffect;
	}

	public ArrayList<String> getNotEffect() {
		return notEffect;
	}

	public void setTypePrim(String typePrim) {
		this.typePrim = typePrim;
	}

	public void setTypeSec(String typeSec) {
		this.typeSec = typeSec;
	}

	public void setSuperEffect(ArrayList<String> superEffect) {
		this.superEffect = superEffect;
	}

	public void setNotEffect(ArrayList<String> notEffect) {
		this.notEffect = notEffect;
	}

}
