package ics.pokemon;

public class pokemonMain {
	public static void main(String[] args) {
		Potions health = new Potions("Large HP");
		Potions mana = new Potions("Large PP");
		Buff buffDef = new Buff("Def Up");
		Buff buffAtk = new Buff("Atk Up");
		
		System.out.println("Item: " + health.getName());
		System.out.println("Item: " + mana.getName());
		System.out.println("Buff: " + buffDef.getName());
		System.out.println("Buff: " + buffAtk.getName());
	}

}
