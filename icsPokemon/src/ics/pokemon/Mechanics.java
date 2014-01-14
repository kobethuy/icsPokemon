/**
 * 
 */
package ics.pokemon;

import java.util.Random;

/**
 * @author KobeThuy
 *
 */
public class Mechanics {
	
	private static Random ran;
	private static int odd;
	
	public static int DmgCalc(PokemonImpl pokemon) {
		return 1;
	}
	
	public static int HpUp(PokemonImpl pokemon) {
		return 1;
	}
	
	public static boolean atkChance(PokemonImpl playerPoke, PokemonImpl enemyPoke, PokemonMove move) {
		
		ran = new Random();
		
		odd = move.getAccuracy() * (playerPoke.getAccuracy() / enemyPoke.getEvasion());
		
		if (ran.nextInt(odd) != 1) {
			return true;
		} else {
			return false;
		}	
	}
	
	public static double dmgEffect() {
		return 1.0;
	}
}
