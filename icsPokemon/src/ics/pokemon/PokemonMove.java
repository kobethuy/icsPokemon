/**
 * 
 */
package ics.pokemon;

/**
 * @author KobeThuy
 *
 */
public class PokemonMove {
	
	private String name;
	private int power, accuracy, pp;
	private PokemonType type;
	
	public PokemonMove (String name, PokemonType type, int pp, int power, int accuracy) {
		setName(name);
		setType(type);
		setPp(pp);
		setPower(power);
		setAccuracy(accuracy);
	}

	public String getName() {
		return name;
	}

	public PokemonType getType() {
		return type;
	}

	public int getPp() {
		return pp;
	}

	public int getPower() {
		return power;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(PokemonType type) {
		this.type = type;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

}
